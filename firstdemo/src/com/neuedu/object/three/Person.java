package com.neuedu.object.three;

public class Person {
    /**
     * 继承：子类继承父类的方法和属性,还具有自己的独有的方法和属性
     *       父类-超类
     *       作用：代码的重用
     */
  private   String name;
   private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
