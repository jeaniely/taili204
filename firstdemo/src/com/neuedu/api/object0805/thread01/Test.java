package com.neuedu.api.object0805.thread01;

public class Test {
    /**
     * 线程的实现
     * 1） 继承Thread类
     * 2)  实现Runnable
     */
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();

        for(int i=0;i<10;i++){
            System.out.println("main:"+(i+1));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
