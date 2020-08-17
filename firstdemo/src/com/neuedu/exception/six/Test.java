package com.neuedu.exception.six;

public class Test {
    public static void main(String[] args) {
        /*values:提取Color中的所有值，返回的是数组*/
        for(Color c:Color.values()){
            System.out.println(c+"  "+c.ordinal());
        }
        System.out.println("=======================================");
        for (CodeName cn:CodeName.values()){
            System.out.println(cn.getCode()+"   "+cn.getName());
        }
         /*  根据code值查找name值*/
        System.out.println("*********");
        System.out.println(CodeName.getName(100));
        System.out.println("==================================");
        for(CodeName01 cn:CodeName01.values()){
            System.out.println(cn.getCode()+"  "+cn.getName());
        }
    }
}
