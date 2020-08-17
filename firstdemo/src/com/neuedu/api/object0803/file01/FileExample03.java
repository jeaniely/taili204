package com.neuedu.api.object0803.file01;

import java.io.File;
import java.io.IOException;

public class FileExample03 {
    public static void main(String[] args) {
        File file=new File("test01.txt");
        if(file.exists()){
            file.delete();
        }else{
            try {
                file.createNewFile();
                System.out.println("路径："+file.getPath());
                System.out.println("绝对路径："+file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
