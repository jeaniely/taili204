package com.neuedu.objectexample.second;

public class Singleton {

    private volatile static Singleton instance;

    private Singleton(){}


    public static Singleton getInstance(){/*双重加锁*/
        if(instance==null){
            synchronized (Singleton.class) {
                if(instance==null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
