package com.neuedu.object.three;

public class Test01 {
    public static void main(String[] args) {
        Child child=new Child();
        child.setName("max");
       child.cry();
        System.out.println(child.getName());

        Person person=new Person();
        person.setName("lili");

        System.out.println(person.getName());

    }
}
