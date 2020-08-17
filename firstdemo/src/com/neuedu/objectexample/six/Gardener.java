package com.neuedu.objectexample.six;

import java.util.Scanner;

public class Gardener {
    public Fruit create(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("卖苹果，香蕉，葡萄：");
        String name=scanner.next();
        if(name.equals("苹果")|| name.equals("apple")){
            return new Apple();
        }else if(name.equals("香蕉")){
            return new Banana();
        }else if(name.equals("葡萄")){
            return new Grape();
        }
        return null;
    }
}
