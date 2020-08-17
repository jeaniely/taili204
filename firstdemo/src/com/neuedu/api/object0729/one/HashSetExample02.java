package com.neuedu.api.object0729.one;

import java.util.HashSet;

public class HashSetExample02 {
    public static void main(String[] args) {
        HashSet<Student> hashSet=new HashSet<>();

        Student student1=new Student();
        student1.setName("zhang");
        student1.setSex("m");
        student1.setAge(19);

        Student student2=new Student();
        student2.setName("li");
        student2.setSex("m");
        student2.setAge(18);

        Student student3=new Student();
        student3.setName("wen");
        student3.setSex("w");
        student3.setAge(22);

        Student student4=new Student();
        student4.setName("wu");
        student4.setSex("w");
        student4.setAge(23);


        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);
        hashSet.add(student1);
        System.out.println("源数据：");
        System.out.println(hashSet);


        //删除数据
        hashSet.remove(student4);
        System.out.println("删除之后的数据：");
        for(Student s:hashSet){
            System.out.println(s);
        }

        //查找数据：
       boolean flag= hashSet.contains(student4);
        System.out.println("查找结果："+flag);
    }
}
