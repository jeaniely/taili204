package com.neuedu.objectexample02.two;

public abstract class Shape {
    /*
    *设计Shape表示图形类，有面积属性area、周长属性per，颜色属性color，
    * 有两个构造方法（一个是默认的、一个是为颜色赋值的），
    * 还有3个抽象方法，分别是：getArea计算面积、getPer计算周长、showAll输出所有信息，
    * 还有一个求颜色的方法getColor。
    *
    * */

    private  double area;
    private double per;
    private String color;

    public Shape(){}
    public Shape(String color){
        this.color=color;
    }

    public abstract double getArea();
    public abstract double getPer();
    public abstract  void showAll();

    public String getColor(){
        return color;
    }

}
