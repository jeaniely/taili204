package com.neuedu.exception.two;

public class ExceptionExample04 {
    public static void main(String[] args) {

        int[] array=new int[5];

        try {
            array[4] = 89;
        }finally {
            System.out.println("无论是否发生异常，都会执行finally中的语句");
        }

    }
}
