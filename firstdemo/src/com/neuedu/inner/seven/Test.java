package com.neuedu.inner.seven;

public class Test {
    public static void main(String[] args) {
        OuerClass outer=new OuerClass();
        InnerClass inner=outer.getInnerClass(6,"neuesoft");
        System.out.println(inner.getNumber());
    }
}
