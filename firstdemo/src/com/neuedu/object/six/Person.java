package com.neuedu.object.six;

public class Person {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("吃水果");
    }

     void sleep(){
         System.out.println("睡觉");
     }
     protected  void jump(){
         System.out.println("跳");
     }
}
