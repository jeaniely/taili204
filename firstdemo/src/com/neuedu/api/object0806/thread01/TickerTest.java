package com.neuedu.api.object0806.thread01;

public class TickerTest {
    public static void main(String[] args) {
        TickerSystem tickerSystem=new TickerSystem(50,new Object());

        Thread thread1=new Thread(tickerSystem,"手机售票");
        Thread thread2=new Thread(tickerSystem,"火车站窗口");
        Thread thread3=new Thread(tickerSystem,"代售点售票");
        Thread thread4=new Thread(tickerSystem,"电脑售票");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
