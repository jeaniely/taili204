package com.neuedu.function;

import java.util.ArrayList;

public class Functon_03 {

    public static void main(String[] args) {
       /* FunctionOver functionOver=new FunctionOver();*/
        /*System.out.println(functionOver.add(45,56));


        System.out.println(functionOver.add(45.56,56));*/


        System.out.println(FunctionOver.add(45,56));


        System.out.println(FunctionOver.add(45.56,56));
    }

}

class FunctionOver{

    /*两个数相加：
    * 数据类型：两个数都是整型
    *           两个数都是double
    *           一个是double，一个是整型
    *
    * 返回值：整型和double
    *
    * */

   static int  add(int a,int b){
        return a+b;
    }

    static double  add(double a,double b){
        return a+b;
    }

    static double  add(int a,double b){
        return a+b;
    }

    static double  add(double a,int b){
        return a+b;
    }
    static double  add(double a,double b,int c){
        return a+b+c;
    }

}