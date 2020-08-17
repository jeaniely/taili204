package com.neuedu.api.object0728.four;


import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class ListExample {
    public static void main(String[] args) {
        //查看一下，ArrayList和LinkedList的速度，插入数据
        long begin1=new Date().getTime();
        ArrayList arrayList=new ArrayList<>();
        for(int i=0;i<1000000;i++){
            arrayList.add(i);
        }
        long end1=new Date().getTime();
        System.out.println(end1-begin1);

        System.out.println("========================");

        long begin2=new Date().getTime();
        LinkedList linkedList=new LinkedList();
        for(int i=0;i<1000000;i++){
            linkedList.add(i);
        }
        long end2=new Date().getTime();
        System.out.println(end2-begin2);
    }
}
