package com.neuedu.objectexample.first;

public class Players01 {
    private static int sum;

    private Players01(){
        sum++;
        System.out.println("创建了一个对象");
    }

    public static  Players01 create(){

        if(sum<11){
            return new Players01();
        }
        return null;
    }
}
