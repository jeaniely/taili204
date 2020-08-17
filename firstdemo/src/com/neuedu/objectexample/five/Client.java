package com.neuedu.objectexample.five;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory=new Factory03();
        ProductA productA=factory.createA();
        productA.operation01();

        ProductB productB=factory.createB();
        productB.operation02();
    }
}
