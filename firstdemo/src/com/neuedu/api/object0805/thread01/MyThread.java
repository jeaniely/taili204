package com.neuedu.api.object0805.thread01;

public class MyThread extends Thread {
    @Override
    public void run() {
      //输出1-10
        for(int i=1;i<=10;i++){
            System.out.println(this.getName()+":"+i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
