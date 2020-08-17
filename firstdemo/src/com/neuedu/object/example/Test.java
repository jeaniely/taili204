package com.neuedu.object.example;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*Goods goods=new Goods();
        goods.setName("水");
        goods.setPrice(2);
        goods.setUnitOfMeasurement("瓶");
        goods.setStock(200);
        System.out.println(goods);*/

        Goods[] goodsarray=new Goods[2];
        Scanner scanner=new Scanner(System.in);
       for(int i=0;i<goodsarray.length;i++){
           goodsarray[i]=new Goods();
           System.out.println("输入第"+(i+1)+"件商品：");
           System.out.println("商品名");
           goodsarray[i].setName(scanner.next());
           System.out.println("单价");
           goodsarray[i].setPrice(scanner.nextDouble());
           System.out.println("单位");
           goodsarray[i].setUnitOfMeasurement(scanner.next());
           System.out.println("库存");
           goodsarray[i].setStock(scanner.nextInt());

       }

     /*  for(int i=0;i<goodsarray.length;i++){
           System.out.println(goodsarray[i]);
       }*/

      for(Goods goods:goodsarray){
          System.out.println(goods);
      }
    }
}
