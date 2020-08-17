package com.neuedu.inner.six;

public class Test {
    public static void main(String[] args) {
        OuterClass outer=new OuterClass();
        InnerClass inner=outer.getInnerClass(6,"neuedu");
        System.out.println(inner.getNumber());
        System.out.println(inner.getString());
    }
}
