package com.neuedu.api.object0803.file01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        File file=new File("test03.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // 字符输出流
        FileWriter writer=null;

        try {
            writer=new FileWriter(file);
            writer.write("hello java!hello html");
            writer.write("hello css".toCharArray());
            writer.flush();

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
