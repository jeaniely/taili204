package com.neuedu.exception.two;

public class ExceptionExample07 {
    public static void main(String[] args) {
        int[] array=new int[5];

        try {
            array[4] = 89;
            System.exit(0);/*系统关闭，jvm关闭*/
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("下标越界");
        }finally {
            System.out.println("无论是否发生异常，都会执行finally中的语句");
        }
        System.out.println("继续执行");
    }
}
