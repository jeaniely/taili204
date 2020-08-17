package com.neuedu.object.five;

public class Person {
    private String name;
    private int age;
    String sex;
    public Person(){
        System.out.println("person01");
    }
    public Person(String name){
        this.name=name;
        System.out.println("person02");
    }
    public Person(int age){
       this.age=age;
        System.out.println("person03");
    }
    public Person(String name,int age){
        this(name);
        this.age=age;
        System.out.println("person04");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("吃东西");
    }

}
