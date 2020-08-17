package com.neuedu.object.eight;

/**
 *  抽象方法和抽象类
 *   关键词：abstract
 *
 *  抽象方法必须在抽象类中，抽象类中不一定有抽象方法
 *
 *  抽象类：抽象方法，成员变量，非抽象方法等
 *
 *  子类：如果是普通类继承抽象类，必须实现抽象类中的抽象方法
 *        如果是抽象类继承抽象类，抽象方法可以实现也可以不是实现
 *
 *  抽象类不能直接实例化，使用普通子类实例化
 *
 */
public abstract class Person {
    public Person(){
        System.out.println("person01");
    }
    public abstract void eat();/*抽象方法*/
}
