package com.neuedu.object.seven;

public class Test02 {
    public static void main(String[] args) {
        /**
         * 多态： 调用同一个方法，实现了不同行为
         *   条件：1）子类继承或者实现父类
         *         2)子类重写父类中方法
         *         3）父类对象由子类实例化实现
         */
        Person person=new Student();
        person.eat();

        System.out.println("================");
        Person person1=new Teacher();
        person1.eat();


    }
}
