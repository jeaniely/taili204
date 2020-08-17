package com.neuedu.api.object0806.thread02;

/**
 * 1：生产者和消费者模式
 * 2：wait、notify、notifyAll的功能，所在类Object
 * 3：可能产生：死锁
 * 4：一般wait、notify、notifyAll和Synchronized一起使用
 */
public class Test01 {
    public static void main(String[] args) {
        Storage storage=new Storage();
        Producer producer=new Producer(storage);
        Consumer consumer=new Consumer(storage);

        producer.start();
        consumer.start();

    }
}
