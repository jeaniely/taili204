package com.neuedu.object.four;

public class Person {
    /**
     * 限定修饰符--作用范围
     * private  同一个类
     * 默认     同一个类 同一个包不同类
     * protected 同一个类 同一个包不同类  不同包的子类中
     * public 同一个类 同一个包不同类    不同包的子类中   不同包非子类中
     *
     * 作用于类、成员变量、方法
     * 其中作用于类中，修饰符两种：默认，public
     * 成员变量、方法： private 默认  protected  public
     *
     */

   private String name;
    int age;
   protected String sex;
   public int height;

    public static void main(String[] args) {
        Person person=new Person();
        person.name="lili";
        person.age=23;
        person.sex="男";
        person.height=180;



    }


}
