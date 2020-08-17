package com.neuedu.inner.six;

public class OuterClass {
    public InnerClass getInnerClass(final int num,String string){
        return new InnerClass(){
            @Override
            public int getNumber() {
                return num+6;
            }

            @Override
            public String getString() {
                return string;
            }
        };
    }
}


interface InnerClass{
    int getNumber();
    String getString();
}