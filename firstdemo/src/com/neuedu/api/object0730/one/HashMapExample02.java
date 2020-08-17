package com.neuedu.api.object0730.one;

import java.util.HashMap;

public class HashMapExample02 {
    /**
     *  使用HashMap实现Student的操作
     * @param args
     */
    public static void main(String[] args) {
        HashMap<String,Student> hashMap=new HashMap<>();
        Student student1=new Student("001","zhang","m",21);
        Student student2=new Student("002","li","w",22);
        Student student3=new Student("003","chen","m",19);
        Student student4=new Student("004","ji","w",20);
        Student student5=new Student("005","wen","m",18);

        hashMap.put(student1.getSid(),student1);
        hashMap.put(student2.getSid(),student2);
        hashMap.put(student3.getSid(),student3);
        hashMap.put(student4.getSid(),student4);
        hashMap.put(student5.getSid(),student5);

        System.out.println("原始数据：");
        System.out.println(hashMap);


        // 删除
        Student s = hashMap.remove("006");
        System.out.println("删除的value值："+s);

        System.out.println("删除之后的数据");
        hashMap.forEach((k,v)-> System.out.println(k+"  "+v));

        //包含
        boolean flagkey=hashMap.containsKey("001");
        System.out.println("key是否包含："+flagkey);

        boolean flagvalue=hashMap.containsValue(student1);
        System.out.println("value是否包含："+flagvalue);

        System.out.println("键值对的个数："+hashMap.size());
    }
}
