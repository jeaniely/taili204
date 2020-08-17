package com.neuedu.inner.four;

public class Test {
    public static void main(String[] args) {
        OuterClass outer=new OuterClass();
        outer.display(true);
        System.out.println("=========================");
        outer.display(false);
    }
}
