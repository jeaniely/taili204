package com.neuedu.inner.five;

public class OuterClass {
    private String name="tianjin";
    private static String sname="neuedu";

    static class InnerClass{
        private String innerName="dalian";
        public static  String sInnerName="xiongan";

        public void display(){
            System.out.println("name:"+sname);
        }

    }

}
