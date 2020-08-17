package com.neuedu.object.six;

public class Student extends Person {

    @Override
    public void eat() {
        System.out.println("吃苹果");
    }

    @Override
    public void jump() {
        System.out.println("蹦蹦跳跳");
    }

    @Override
     void sleep() {
        System.out.println("在沙发上睡觉");
    }
}
