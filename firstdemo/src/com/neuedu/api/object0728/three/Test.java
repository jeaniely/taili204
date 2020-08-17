package com.neuedu.api.object0728.three;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Goods> goodsArrayList=new ArrayList<>();
        GoodsController.addGoods(goodsArrayList,3);
        System.out.println(goodsArrayList);
        String name="水";
        /*int index=GoodsController.findGoodsByName(goodsArrayList,name);
        if(index==-1){
            System.out.println("没有这件商品");
        }else{
            System.out.println(goodsArrayList.get(index));
        }*/

      /*  Goods goods=GoodsController.deleteGoodsByName(goodsArrayList,name);
        System.out.println(goods);
        System.out.println(goodsArrayList);*/

      GoodsController.updateGoodsByName(goodsArrayList,name);
        System.out.println(goodsArrayList);
    }
}
