package com.neuedu.api.object0806.thread02;

import java.util.LinkedList;

public class Storage {
    private final int MAX_NUMBER=10;
    private LinkedList<String> query=new LinkedList<>();//仓库

    /**
     * 生成汉堡，放入仓库
     * @param i
     */
    public void produce(String i){

        synchronized (query) {
            while (query.size()==MAX_NUMBER){
                System.out.println("仓库已满！");

                try {
                    query.wait();//生产者等待消费者唤醒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("生成汉堡：" + i);
            query.add(i);
           query.notify();// 唤醒的消费者的等待
        }
    }

    /**
     *  从仓库中消费汉堡
     * @return
     */
    public String consumer(){
       synchronized (query) {
          while (query.size()==0){
              System.out.println("仓库已空！！！");

              try {
                  query.wait();// 消费者等待生产者唤醒
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }

           String s = query.removeFirst();
           System.out.println("消费汉堡：" + s);
          query.notify();//唤醒生产者的等待
           return s;
       }
    }


}
