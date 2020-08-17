package com.neuedu.api.object0727.math;

import java.math.BigDecimal;
import java.util.Random;

public class MathExample {
    public static void main(String[] args) {
        //Math类中方法的使用
        //比如：求圆的面积
        double r=10;
        double area=Math.PI*Math.pow(r,2);
        System.out.println(area);

        //随机数的生成
        double random=Math.random();
        System.out.println(random);
        //生成0-100之间的数
        int randomint=((int)(random*101));/*%101;*/
        System.out.println(randomint);
        System.out.println("============================");
        Random random1=new Random();
        int int2=random1.nextInt(101);
        System.out.println(int2);
        System.out.println("===================================");
        //price 数据库中存放使用decimal，对应java的数据类型BigDecimal
        BigDecimal bg=new BigDecimal("12");
        BigDecimal bg2=new BigDecimal("12.6");
        System.out.println(bg.add(bg2));
        System.out.println(bg.pow(2));
        /*System.out.println(bg.divide(bg2));*/
        System.out.println(bg.intValue());
    }
}
