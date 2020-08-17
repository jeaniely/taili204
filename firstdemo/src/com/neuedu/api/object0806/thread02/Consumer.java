package com.neuedu.api.object0806.thread02;


/**
 * 消费者
 */
public class Consumer  extends Thread{
    private Storage storage;
    public Consumer(Storage storage){
       this.storage=storage;
    }

    @Override
    public void run() {
        while(true){
            storage.consumer();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
