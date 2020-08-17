package com.neuedu.exception.five;

public class Test {
    public static void main(String[] args) {
        String str="neuedu";
        try {
            UseMyException01.checkString(str);
        }catch (MyException02 e){
            e.printStackTrace();
            System.out.println(e.getMsg());
        }
    }
}
