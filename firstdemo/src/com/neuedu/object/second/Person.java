package com.neuedu.object.second;

public class Person {
    /***
     *  封装：保证数据有效安全
     *       属性私有化：private
     *       调用：使用公共的getter和setter方法
     *       其他:1)输出，通过重写toString方法，
     *            2）赋值：构造器
     */
    private String name;
   private int age;

   public Person(){}
   public Person(String name,int age){
       this.name=name;
       this.age=age;
   }
    /**
     * name的setter方法
     * 写
     */
   public void setName(String name){
       if(name!=null){
           this.name=name;
       }
   }
    /**
     * name的getter方法
     * 读取
     */
  public String getName(){
      return name;
  }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
