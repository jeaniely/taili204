package com.neuedu.api.object0730.one;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    /**
     * HashMap
     * 1) value,key可以为null
     * 2）key相同的时候，保留最后添加的数值
     * 3） 不同步
     * @param args
     */
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("001","zhang");
        hashMap.put("002","li");
        hashMap.put(null,null);
        hashMap.put("001","chen");
        System.out.println(hashMap);
        System.out.println("=============================");
        //先得到keys，在根据key得出value
        Set<String> keys = hashMap.keySet();//求出所有的key放入set集合中
        for(String k:keys){
            System.out.println(k+"  "+hashMap.get(k));//通过get方法得到value
        }
        System.out.println("=============================");
        //将key和value放入实体类中Map.Entry
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for(Map.Entry<String,String> e:entries){
            System.out.println(e.getKey()+"  "+e.getValue());
        }

        System.out.println("================================");
        //lambda
        hashMap.forEach((k,v)-> System.out.println(k+"  "+v));
    }
}
