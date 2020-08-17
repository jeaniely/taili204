package com.neuedu.api.object.three;

public class StringExample01 {
    public static void main(String[] args) {
        /**
         * 输入电话号码：123-0506-7894
         *  显示：12305067894
         *  1） 分割，split
         *  2）合并
         */
        String str="123-0506-7894";

        String[] strings=str.split("-");
        for(String s:strings){
            System.out.println(s);
        }

       StringBuilder b=new StringBuilder();
        for(String s:strings){
            b.append(s);
        }

        System.out.println(b.toString());



    }
}
