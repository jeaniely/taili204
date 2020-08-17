package com.neuedu.objectexample02.one;

public class Car extends Vehicle {
    private  int loader;

    public Car(String brand,String color,int loader){
        super(brand,color);
        this.loader=loader;
    }

    @Override
    public void run() {
        System.out.println("小汽车品牌："+getBrand()+" 颜色："+getColor()+" 速度："+getSpeed()+" 载人数："+loader);
    }
}
