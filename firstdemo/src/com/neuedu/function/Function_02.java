package com.neuedu.function;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class Function_02 {
    public static void main(String[] args) {
        FunctionExmaple exmaple=new FunctionExmaple();

        System.out.println("输入一个年");
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();

        boolean flag=exmaple.checkYear(year);

        if(flag){
            System.out.println("是闰年");
        }else{
            System.out.println("是平年");
        }

    }
}

class FunctionExmaple{
    /*
    * 输入年，判断这个年是闰年还平年
    * 使用方法
    * */

     boolean checkYear(int year){
         boolean flag=false;
         if(year%4==0&& year%100!=0 ||year%400==0){
             flag=true;
         }
         return flag;
     }


}
