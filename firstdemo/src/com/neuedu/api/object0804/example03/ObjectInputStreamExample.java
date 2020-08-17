package com.neuedu.api.object0804.example03;

import java.io.*;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * 1 找到文件
         * 2 生成FileInputStream对象
         * 3 生成ObjectInputStream对象
         * 4 读取数据
         * 5 关闭
         */

        File file=new File("text05.txt");

        if(!file.exists()){
            System.out.println("文件不存在，不能进行读取！");
            return ;
        }


        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);

        Student student1 =(Student) ois.readObject();
        Student student2 =(Student) ois.readObject();
        System.out.println(student1);
        System.out.println(student2);

        ois.close();
        fis.close();


    }
}
