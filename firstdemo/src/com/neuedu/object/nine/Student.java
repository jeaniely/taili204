package com.neuedu.object.nine;

public class Student implements Person,Free {
    @Override
    public void eat() {
        System.out.println("吃葡萄");
    }

    @Override
    public void sleep() {
        System.out.println("在地上谁");
    }

    @Override
    public void jump() {
        System.out.println("蹦蹦跳跳");
    }
}
