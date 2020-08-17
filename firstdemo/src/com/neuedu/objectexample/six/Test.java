package com.neuedu.objectexample.six;

public class Test {
    public static void main(String[] args) {
     Fruit fruit=   new Gardener().create();
     if(fruit==null){
         System.out.println("不买这种水果");
     }
    }
}
