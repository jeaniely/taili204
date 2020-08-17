package com.neuedu.objectexample.second;

public class Single01Test {
    public static void main(String[] args) {
        Singleton01 singleton=Singleton01.getInstance();
        System.out.println(singleton);
        Singleton01 singleton2=Singleton01.getInstance();
        System.out.println(singleton2);
        Singleton01 singleton3=Singleton01.getInstance();
        System.out.println(singleton3);
        Singleton01 singleton4=Singleton01.getInstance();
        System.out.println(singleton4);
    }
}
