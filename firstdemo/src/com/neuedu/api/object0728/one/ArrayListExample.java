package com.neuedu.api.object0728.one;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        /**
         * 案例1：实现下面输入的添加，并进行显示
         *          *       45，“tom”，45.6，45
         */

        ArrayList arrayList=new ArrayList();
        arrayList.add(45);
        arrayList.add("tom");
        arrayList.add(45.6);
        arrayList.add(45);
        System.out.println(arrayList);
        System.out.println("=====================================");
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println("=============================");

        for(Object obj:arrayList){
            System.out.println(obj);
        }
        System.out.println("============================");

        Iterator iterator=arrayList.iterator();
        while(iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }

    }
}
