package com.neuedu.inner.three;

public class OuterClass {
    private String name;

    public void outerDisplay(){
        System.out.println("outerclass.....");
    }

    public class InnerClass{
        public void innerDisplay(){
            name="neuedu";
            System.out.println(name);
            outerDisplay();
        }
    }

    public InnerClass getInnerClass(){
        return new InnerClass();
    }

}
