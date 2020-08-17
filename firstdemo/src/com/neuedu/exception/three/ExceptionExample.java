package com.neuedu.exception.three;

import java.io.File;
import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) throws IOException,RuntimeException {
        File file=new File("d:/test.txt");
        if(file.exists()){
            file.delete();
        }else{
            file.createNewFile();
        }
    }
}
