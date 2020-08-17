package com.neuedu.api.object0728.three;

import java.util.List;
import java.util.Scanner;

public class GoodsController {
    static  Scanner scanner=new Scanner(System.in);
    /**
     * 单个商品的添加
     * @param goodsList
     */
    public static void addGoods(List<Goods> goodsList){
        Goods goods=new Goods();
        System.out.println("商品名");
        goods.setName(scanner.next());
        System.out.println("单价");
        goods.setPrice(scanner.nextBigDecimal());
        System.out.println("库存");
        goods.setStock(scanner.nextInt());

        goodsList.add(goods);

    }

    /**
     * 多件商品添加
     * @param goodsList
     * @param n
     */
    public static void addGoods(List<Goods> goodsList,int n){
        for(int i=0;i<n;i++){
            System.out.println("第"+(i+1)+"件商品添加：");
            addGoods(goodsList);
        }
    }

    /**
     * 根据商品名进行商品查询，返回的是下标
     * @param goodsList
     * @param name
     * @return
     */
    public static int findGoodsByName(List<Goods> goodsList,String name){
        for(int i=0;i<goodsList.size();i++){
            if(goodsList.get(i).getName().equals(name)){
                return i;
            }
        }
     return -1;
    }

    /**
     * 删除
     * @param goodsList
     * @param name
     * @return
     */
    public static Goods deleteGoodsByName(List<Goods> goodsList,String name){
        int index=findGoodsByName(goodsList,name);
        if(index==-1){
            return null;
        }else{
            Goods goods=goodsList.get(index);
            goodsList.remove(index);

            return goods;
        }
    }

   public static void updateGoodsByName(List<Goods> goodsList,String name){
        int index=findGoodsByName(goodsList,name);
        if(index==-1){
            System.out.println("没有商品修改");
        }else {
            Goods goods=goodsList.get(index);
            System.out.println("单价修改");
            goods.setPrice(scanner.nextBigDecimal());

            goodsList.set(index,goods);
        }
   }
}
