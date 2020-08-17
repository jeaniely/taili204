package com.neuedu.objectexample.second;

public class Singleton01 {

    private  static Singleton01 instance=new Singleton01();

    private Singleton01(){}

    public static Singleton01 getInstance(){
        return instance;
    }
}
