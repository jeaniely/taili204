package com.neuedu.array;

import java.util.ArrayList;
import java.util.Random;

public class ArrayExample01 {
    public static void main(String[] args) {
        int[] a=new int[10];
        Random random=new Random();/*随机数的类*/
        /*赋值*/
       /* a[0]=56;
        a[1]=45;*/
       /*a[10]=23;*/// java.lang.ArrayIndexOutOfBoundsException: 10
        for(int i=0;i<a.length;i++){
            /*随机赋值*/
            a[i]=random.nextInt(100);
        }


        /*输出*/
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("--------------------------");

        for(int k:a){
            System.out.println(k);
        }
        ArrayList araay;
    }
}
