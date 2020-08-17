package com.neuedu.exception.one;

import java.io.File;

public class ExceptionExample01 {
    /*建议，不要使用系统中给定的类名进行定义*/
    public static void main(String[] args) {

        /*RuntimeException异常，不检查异常，可以处理，可不处理*/
        int[] array=new int[5];
        array[5]=89;
        System.out.println("继续执行");
        /*非运行时异常，检查异常，需要处理*/
       /* File file=new File("d:/test.txt");
        if(file.exists()){
            file.delete();
        }else{
            file.createNewFile();
        }*/

    }

}
