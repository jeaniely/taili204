package com.neuedu.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample02 {
    /*
    * 使用数组实现添加
    *   根据输入的位置进行添加
    * */
    public static void main(String[] args) {
        /*初始化一个数组*/
        int a[]=new int[10];
        /*通过随机数进行9个数据的添加*/
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);


        for(int i=0;i<a.length-1;i++){
            a[i]=random.nextInt(100);
        }
        /*插入之前*/
        System.out.println("插入之前");
        for(int j:a){
            System.out.print(j+"  ");
        }
        System.out.println("输入位置");
        int k=scanner.nextInt();

        System.out.println("输入数据");
        int num=scanner.nextInt();

        if(k<0 ||k >a.length){
            System.out.println("插入的位置有误");
        }else{
            for(int last=a.length-2;last>=k-1;last--){/*从k-1开始后面的所有值都移动一位*/
                a[last+1]=a[last];
            }
            a[k-1]=num;/*插入输入的数据*/


        }

        System.out.println("\n插入之后的结果");
        for(int j:a){
            System.out.print(j+"  ");
        }


    }
}
