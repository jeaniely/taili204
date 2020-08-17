package com.neuedu.api.object0729.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        Student student1=new Student("zhang",19);
        Student student2=new Student("li",21);
        Student student3=new Student("wu",20);
        Student student4=new Student("chen",23);
        Student student5=new Student("ji",18);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        System.out.println("源数据：");
        System.out.println(list);

        //排序
        Collections.sort(list);
        System.out.println("按照姓名排序之后的数值：");

        list.forEach((e)-> System.out.println(e));

        //排序
        Collections.sort(list,new MyComparator());

        System.out.println("按照年龄排序之后的数值：");

        list.forEach((e)-> System.out.println(e));


        // 反转

        Collections.reverse(list);
        System.out.println("反转之后的结果：");
        list.forEach((e)-> System.out.println(e));


        //洗牌

        Collections.shuffle(list);
        System.out.println("洗牌之后的结果:");
        list.forEach((e)-> System.out.println(e));
    }
}
