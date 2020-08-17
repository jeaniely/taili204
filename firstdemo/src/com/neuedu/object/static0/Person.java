package com.neuedu.object.static0;

public class Person {
    private String name;
    private  static int num;
    public Person(){
        num++;
        System.out.println("创建的用户对象个数："+num);
    }
static{/*jdbc:用于导入数据库驱动；导入文件*/
    System.out.println("hello");
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        eat();
        this.name = name;
    }

    public static void eat(){
        System.out.println("吃"+""+num);
    }
}
