package com.neuedu.api.object0804.example02;

import java.io.*;

public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        /**
         * 1 找文件
         * 2 生成File'InputStream对象
         * 3 生成Data'InputStream对象
         * 4 提取数据
         * 5 关闭
         */

        File file=new File("test04.txt");
        if(!file.exists()){
            System.out.println("文件不存在，不能进行读取");
            return ;
        }

        FileInputStream fis=new FileInputStream(file);
        DataInputStream dis=new DataInputStream(fis);

        int i = dis.readInt();
        System.out.println(i);



        double v = dis.readDouble();
        System.out.println(v);

        String s = dis.readUTF();
        System.out.println(s);

        dis.close();
        fis.close();

    }
}
