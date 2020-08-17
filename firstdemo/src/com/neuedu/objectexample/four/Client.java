package com.neuedu.objectexample.four;

public class Client {
    public static void main(String[] args) {
        FactoryMethod factoryMethod=new Factory01();
        Product product=factoryMethod.create();
        product.operation01();
        product.operation02();
    }
}
