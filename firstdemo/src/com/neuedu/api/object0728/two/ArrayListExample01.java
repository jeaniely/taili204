package com.neuedu.api.object0728.two;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample01 {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();

        Student student=new Student();
        student.setName("tom");
        student.setSex("m");
        student.setAge(21);

        students.add(student);

        Student student1=new Student();
        student1.setName("lili");
        student1.setSex("w");
        student1.setAge(21);

        students.add(student1);

        Student student2=new Student();
        student2.setName("jasper");
        student2.setSex("m");
        student2.setAge(21);

        students.add(student2);
        students.add(student1);
        students.add(0,student2);


        System.out.println(students);

        System.out.println("====================");
        for(int i=0;i<students.size();i++){
            /*Student s=students.get(i);
            System.out.println(s.getName()+"  "+s.getSex()+" "+s.getAge());*/
            System.out.println(students.get(i));
        }
        System.out.println("====================");
        for(Student s:students ){
            System.out.println(s);
        }
        System.out.println("===================");
        Iterator<Student> iterator=students.iterator();
        while(iterator.hasNext()){
            Student s=iterator.next();
            System.out.println(s);
        }
    }
}
