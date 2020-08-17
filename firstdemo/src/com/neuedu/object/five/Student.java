package com.neuedu.object.five;

public class Student extends Person {
    public Student(){
       /* super();*//*默认*/
        System.out.println("student01");
    }
    public Student(String name){
        super(name);/*super() 父类构造器*/
        System.out.println("student02");
    }
    public Student(int age){
        super(age);
        System.out.println("student02");
    }
    public Student(String name,int age){
        super(name,age);
        System.out.println("student03");
    }

    public Student(String name,int age,String sex){
        /*super(name,age);*/
        this(name,age);
        /*this(age);*/
        /*super(age);*//* this()和super（） 中，只能有一个,只能有一条*/
        super.sex=sex;/*父类对象*/
       /* super.eat();*/
        System.out.println("student04");
    }
}
