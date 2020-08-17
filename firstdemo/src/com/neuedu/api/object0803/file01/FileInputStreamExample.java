package com.neuedu.api.object0803.file01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    /**
     * 将字节文档中的数据提取
     * 输入流，读
     * @param args
     */
    public static void main(String[] args) {
        //文件
        File file=new File("test02.txt");
        if(!file.exists()){
            System.out.println("文件不存在，不能读取数据！");
            return;
        }
                // 生成字节输入流
        FileInputStream fis=null;

        try {
            fis=new FileInputStream(file);
            int re=fis.read();
            System.out.println(re);
            /*int r1=fis.read();
            while(r1!=-1) {
                System.out.print((char) r1);
                r1=fis.read();
            }*/
           byte[] b=new byte[30];
           int length=fis.read(b);
            System.out.println(new String(b,0,length));
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
