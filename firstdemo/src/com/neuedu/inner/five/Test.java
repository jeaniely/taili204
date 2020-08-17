package com.neuedu.inner.five;

public class Test {
    public static void main(String[] args) {
        System.out.println(OuterClass.InnerClass.sInnerName);
        OuterClass.InnerClass inner=new OuterClass.InnerClass();
        inner.display();
    }
}
