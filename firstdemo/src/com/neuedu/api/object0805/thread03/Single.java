package com.neuedu.api.object0805.thread03;

public class Single {

    private Single(){
        System.out.println("创建了一个实例对象");
    }
    private static Single instance;
    public  static Single getInstance(){//对方法进行同步：public  synchronized static Single getInstance()
        if(instance==null){
            synchronized (Single.class) {//在代码块中加锁，需要锁定对象
                if(instance==null) {
                    instance = new Single();
                }
            }
        }
        return instance;
    }

}
