package com.neuedu.api.object0803.file01;

import java.io.File;

public class FileExample02 {
    public static void main(String[] args) {
        File file=new File("D:/demo/dir");
        System.out.println("是否存在："+file.exists());
        System.out.println("是否是文件："+file.isFile());
        System.out.println("是否是目录："+file.isDirectory());
        System.out.println("大小："+file.length());

        File[] files = file.listFiles();
        for(File f:files){
            System.out.println("---------------------------------");
            System.out.println("是否是文件："+f.isFile());
            System.out.println("大小："+f.length());
            System.out.println("文件名："+f.getName());
        }
    }
}
