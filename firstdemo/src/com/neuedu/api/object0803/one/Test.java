package com.neuedu.api.object0803.one;

public class Test {
    public static void main(String[] args) {
        MyStudent student=new MyStudent();
        student.setData(45);
        System.out.println(student.getData());

        MyStudent<Integer> student1=new MyStudent<>();
        student1.setData(12);
        System.out.println(student1.getData());
    }
}
