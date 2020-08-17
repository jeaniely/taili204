package com.neuedu.api.object0729.two;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample04 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet=new TreeSet<>(new MyComparator());
        Student student1=new Student("zhang",22);
        Student student2=new Student("wu",16);
        Student student3=new Student("ji",21);
        Student student4=new Student("chen",20);
        Student student5=new Student("liu",19);
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);

        Iterator<Student> iterator=treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
