package com.neuedu.api.object0806.thread01;

public class TickerSystem implements  Runnable{
    private int tickers;
    private Object obj;

    public TickerSystem(int tickers, Object obj) {
        this.tickers = tickers;
        this.obj = obj;
    }


    @Override
    public  void run() {
        while(true) {
            if (tickers > 0) {
                synchronized(obj) {//在代码块中加锁，进行同步
                    if(tickers>0) {
                        System.out.println("买票：" + tickers+" 售票点："+Thread.currentThread().getName());
                        tickers--;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("票已经买完！");
                break;
            }
        }
    }
}
