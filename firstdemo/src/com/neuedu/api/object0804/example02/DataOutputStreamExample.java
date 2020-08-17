package com.neuedu.api.object0804.example02;

import java.io.*;

public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {
        /**
         * 1 文件，可以创建
         * 2 生成FileOutputStream类对象
         * 3 生成DataOutputStream类对象
         * 4 写入数据
         * 5 关闭
         */

        File file=new File("test04.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream fos=new FileOutputStream(file);

        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(45);

        dos.writeDouble(45.3);

        dos.writeUTF("hello student");
        dos.flush();

        dos.close();
        fos.close();



    }
}
