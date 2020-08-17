package com.neuedu.api.object0730.three;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        /**
         *  key不能为null，value可以
         */
        TreeMap<String,String> treeMap=new TreeMap<>();
        treeMap.put("005","zhang");
        treeMap.put("002","li");
        treeMap.put("004","wen");
        treeMap.put("003",null);
        System.out.println(treeMap);
        System.out.println("============================");
        treeMap.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("===========================");
        for(Map.Entry<String,String> e:treeMap.entrySet()){
            System.out.println(e.getKey()+"  "+e.getValue());
        }
    }
}
