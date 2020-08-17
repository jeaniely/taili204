package com.neuedu.object.seven;

public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("lili");
        Person person=student;//向上转型，自动完成
        System.out.println(person.getName());
        person.eat();

        System.out.println("============================");
        Person person1=new Person();
        person1.setName("tom");
        System.out.println(person1.getName());
        person1.eat();

        System.out.println("========================");
        if(person instanceof Student) {
            Student student1 = (Student) person;/*向下转型，强制转换*/
            System.out.println(student1.getName());
            student1.eat();
        }
        System.out.println("===================");
        /*Student student2=(Student) person1;*//*向下转型，强制转换*//*
        System.out.println(student2.getName());
        student2.eat();*/
        /*
        *   判断对象，是否是类的实例化对象
        *    instanceof
        *
        *  格式： 对象 instanceof  类
        *   结果：true|false
        *
        * */
        System.out.println("student 是否是Student类的实例化对象");
        if(student instanceof  Student){
            System.out.println("是");
        }else {
            System.out.println("否");
        }
        System.out.println("student 是否是Person类的实例化对象");
        if(student instanceof  Person){
            System.out.println("是");
        }else {
            System.out.println("否");
        }
        System.out.println("person 是否是Student类的实例化对象");
        if(person instanceof  Student){
            System.out.println("是");
        }else {
            System.out.println("否");
        }
        System.out.println("person 是否是Person类的实例化对象");
        if(person instanceof  Person){
            System.out.println("是");
        }else {
            System.out.println("否");
        }

        System.out.println("person1 是否是Student类的实例化对象");
        if(person1 instanceof  Student){
            System.out.println("是");
        }else {
            System.out.println("否");
        }
        System.out.println("person1 是否是Person类的实例化对象");
        if(person1 instanceof  Person){
            System.out.println("是");
        }else {
            System.out.println("否");
        }
    }
}
