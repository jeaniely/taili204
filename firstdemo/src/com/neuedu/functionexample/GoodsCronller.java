package com.neuedu.functionexample;

import java.util.Scanner;

public class GoodsCronller {
    /*  实现的方法
    * */

    private static Scanner scanner=new Scanner(System.in);

    /**
     * 商品的添加---数组的添加
     * @param name
     * @param number
     * @param price
     */
    public static void init(String[] name,int[] number,double[] price){
        for(int i=0;i<name.length;i++){
            System.out.println("第"+(i+1)+"商品信息的输入：");
            System.out.println("商品名：");
            name[i]=scanner.next();
            System.out.println("库存：");
            number[i]=scanner.nextInt();
            System.out.println("单价：");
            price[i]=scanner.nextDouble();
        }
    }

    /**
     * 商品的显示--数组的输出
     * @param name
     * @param number
     * @param price
     */
    public static void printGoods(String[] name,int[] number,double[] price) {
        System.out.println("商品名"+"\t"+"库存"+"\t"+"单价");
        for(int i=0;i<name.length;i++) {
            System.out.println(name[i]+"\t"+number[i]+"\t\t"+price[i]);
        }
    }

    /**
     *
     * @param cart  购物车
     * @param cartNum 购物数量
     * @return 购物的总商品数
     */
    public static int inputCart(String[] cart,int[] cartNum) {
          int number=0;

        while(true){
            System.out.println("第"+(number+1)+"购物商品的输入：");
            System.out.println("商品名：");
            cart[number]=scanner.next();
            System.out.println("数量：");
            cartNum[number]=scanner.nextInt();

            number++;

            System.out.println("是否还需要购买？（1继续，0 不购买了）");
            int k=scanner.nextInt();
           if(k==0){
               break;
           }

        }

        return number;
    }

    /**
     *   单个商品的总价格
     * @param name
     * @param number
     * @param price
     * @param cart
     * @param cartNum
     * @param num
     * @param nameprices
     */
    private static void computePrice(String[] name,int[] number,double[] price,String[] cart,int[] cartNum,int num,double[] nameprices) {

       for (int j=0;j<num;j++) {

            for (int i = 0; i < name.length; i++) {
                if (name[i].equals(cart[j])) {
                    number[i] -= cartNum[j];/*库存减少*/
                    nameprices[j] = price[i] * cartNum[j];/* 某一个商品的总价格*/
                }
            }

        }

    }

    /**
     * 所购买商品的总价格
     * @param num
     * @param nameprices
     * @return
     */
    private static double sumPrice(int num,double[] nameprices){
        double sum=0;
        for(int i=0;i<num;i++){
            sum+=nameprices[i];
        }
        return sum;
    }

    /**
     * 打印小票
     * @param name
     * @param number
     * @param price
     * @param cart
     * @param cartNum
     * @param num
     */
    public static void printCart(String[] name,int[] number,double[] price,String[] cart,int[] cartNum,int num){
        double[] nameprices=new double[num];
        computePrice(name,number,price,cart,cartNum,num,nameprices);

        double sumPrice=sumPrice(num,nameprices);

        System.out.println("\t永辉超市");
        System.out.println("-----------------------");
        System.out.println("商品名\t数量\t单价\t价格");
        for(int i=0;i<num;i++){
            System.out.print(cart[i]+"\t"+cartNum[i]+"\t");
            for(int j=0;j<name.length;j++){
                if(cart[i].equals(name[j])){/*字符比较内容是否相同使用equals方法*/
                    System.out.print(price[j]+"\t");
                    break;
                }
            }

            System.out.println(nameprices[i]);
        }
        System.out.println("-----------------------");
        System.out.println("总付款"+sumPrice);

    }

}
