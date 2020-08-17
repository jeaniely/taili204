package com.neuedu.object.first;

public class Person {
    /**
     * 属性：变量---成员变量
     *
     * 行为：方法--成员方法
     *
     * 构造器：特殊的方法：没有返回值，方法名使用类名来定义
     *       作用：1)类的实例化--生成对象
     *             2)赋值--成员变量
     *       构造器的重载
     */
    String name;
    int age;
    int height;
    public Person(){}/*默认*/
    public Person(String name){
        this.name=name;//this:本类对象
    }
    public Person(String name,int age){
        //this.name=name;//this:本类对象
        this(name);//一个类中的构造器调用另一个构造器，使用this(),调用的是构造器
        this.age=age;
    }
    public Person(String name,int age,int height){
        //this.name=name;//this:本类对象
        //必须放在第一行执行
        this(name,age);//一个类中的构造器调用另一个构造器，使用this(),调用的是构造器

        this.height=height;
    }

    void eat(){
        System.out.println("吃东西");
    }


}
