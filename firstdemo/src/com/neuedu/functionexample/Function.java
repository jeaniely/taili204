package com.neuedu.functionexample;

import java.util.Scanner;

public class Function {
    /*
    * 模拟：超市买东西，打印小票
    *    小票格式：
    *           XXXXX超市
    *      --------------------------
    *        商品   单价  数量   总价
    *       铅笔   5     2       10
    *       饭盒    100   1      100
    *       -------------------------
    *        总价：110 元
    *        总付款： 110元
    *
    *  案例分析思路：
    *   1）有商品
    *      三个数组：
    *      String[] name  商品名
    *      int[]  number  库存
    *      double[] price  单价
    *
    *  2）购物车
    *      使用数组  String[] cart 模拟购物车，主要商品名
    *      使用数组  int[] cartNum 模拟购物车，主要商品数量
    *  3） 计算每个商品的总价，和所有商品的总价
    *      double[]  nameprices
    *      double sumprices;
    * 4)  打印小票
    *
    *
    * */

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        nemu();
    }
      public static void nemu(){
          String name[]=new String[5];
          int number[]=new int[5];
          double price[]=new double[5];

          String[] cart=new String[5];
          int cartNum[]=new int[5];
          int num=0;
          while(true) {
              System.out.println("1.添加商品");
              System.out.println("2.输出商品");
              System.out.println("3.购物");
              System.out.println("4.打印小票");
              System.out.println("5.退出");
              int n=scanner.nextInt();
              if(n==1) {
                  GoodsCronller.init(name, number, price);
              }else if(n==2) {
                  GoodsCronller.printGoods(name, number, price);
              }else if(n==3) {
                  num = GoodsCronller.inputCart(cart, cartNum);
              } else if(n==4) {
                  GoodsCronller.printCart(name, number, price, cart, cartNum, num);
              }else if(n==5){
                  System.out.println("退出系统");
                  break;
              }
          }
      }



}
