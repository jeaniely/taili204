package com.neuedu.inner.seven;

public class OuerClass {
    public InnerClass getInnerClass(final int num,String string) {
        return ()->num+6;
    }
}

interface  InnerClass{
    int getNumber();
}