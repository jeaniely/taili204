package com.neuedu.array;

import java.util.Random;

public class ArrayExample03 {
    public static void main(String[] args) {
        int[][] array=new int[3][4];
        Random random=new Random();

       /* System.out.println(array[1].length);*/
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=random.nextInt(100);
            }
        }

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){/*每行中所有的列数据输出*/
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();/*一行一换行*/
        }




    }
}
