package com.neuedu.api.object0803.file01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExmaple {
    /**
     *  使用字节流将数据存放到文档中
     *  输出流，写
     * @param args
     */
    public static void main(String[] args) {
        //文件
        File file =new File("test02.txt");
        //文件不存在，需要创建
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //生成字节输出流

        FileOutputStream fos=null;

        try {
            fos=new FileOutputStream(file,true);
            fos.write(45);
            fos.write("hello student!".getBytes());

            fos.flush();

            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
