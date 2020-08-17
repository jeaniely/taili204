package com.neuedu.api.object0804.example03;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        /**
         * 1 创建文件
         * 2 生成FileOutputStream对象
         * 3  生成ObjectOutputStream对象
         * 4： 将数据输出到文件中
         * 5. 关闭
         */

        File file=new File("text05.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fos=new FileOutputStream(file);

        ObjectOutputStream oos=new ObjectOutputStream(fos);

        Student student1=new Student("zhang",19,new BigDecimal("88"));
        Student student2=new Student("li",20,new BigDecimal("74"));

        oos.writeObject(student1);
        oos.writeObject(student2);

        oos.flush();

        oos.close();
        fos.close();

    }
}
