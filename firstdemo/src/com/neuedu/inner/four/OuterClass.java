package com.neuedu.inner.four;

public class OuterClass {
    private void innerDisplay(boolean b){
        if(b){
            class InnerClass{
                private String name;
                public InnerClass(String name){
                    this.name=name;
                }
                public String getName(){
                    return name;
                }
            }

            InnerClass inner=new InnerClass("neuedu");
            System.out.println(inner.getName());

        }else{
            System.out.println("else无效位置");
        }
        System.out.println("if之外无效位置");
    }


    public  void display(boolean b){
        innerDisplay(b);
    }
}
