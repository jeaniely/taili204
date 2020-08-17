package com.neuedu.api.object0803.file01;

import java.io.File;

public class FileExample01 {
    public static void main(String[] args) {
        File file=new File("D:/demo/data.txt");
       /* File file=new File("D:\\demo\\data.txt");*/
        System.out.println("是否存在这个文件："+file.exists());
        System.out.println("是否是文件："+file.isFile());
        System.out.println("是否是目录："+file.isDirectory());
        System.out.println("绝对路径："+file.getAbsolutePath());
        System.out.println("文件大小："+file.length());
        System.out.println("文件名："+file.getName());
        System.out.println("路径："+file.getPath());
    }
}
