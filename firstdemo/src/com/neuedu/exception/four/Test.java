package com.neuedu.exception.four;

public class Test {
    public static void main(String[] args) {
        String str=null;

        try {
            UseMyException.checkString(str);
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
