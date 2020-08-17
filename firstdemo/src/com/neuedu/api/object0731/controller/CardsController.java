package com.neuedu.api.object0731.controller;

import com.neuedu.api.object0731.entry.Card;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CardsController {
    private CardsController(){}

    public static void print(List<Card> cardList){
        System.out.println("这副牌的内容：");
        for(int i=0;i<cardList.size();i++){
            System.out.print(cardList.get(i)+"\t");
            if((i+1)%10==0){
                System.out.println();
            }
        }
        System.out.println();
    }

    /**
     * 洗牌
     * @param cardList
     */
    public static void shuffle(List<Card> cardList){
        Collections.shuffle(cardList);
    }

    /**
     * 通过输入的第几个牌，从集合中进行提取，并且这个集合，删除这个牌
     * @param cardList
     * @return
     */
    public  static Card getPersonCard(List<Card> cardList){
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入抽取：（1-"+cardList.size()+"）");
        int index=scanner.nextInt();

        while(index<1||index>cardList.size()){
            System.out.println("重新输入：");
            index=scanner.nextInt();
        }

        /*Card card=cardList.get(index-1);
        cardList.remove(index-1);
        return card;*/

        return cardList.remove(index-1);
    }

    public static Card getComputerCard(List<Card> cardList){
        //随机抽取
        Random random=new Random();
        System.out.println("计算机的随机数生成：");
        int index=random.nextInt(cardList.size())+1;//1-51 0-50

        return cardList.remove(index-1);
    }

    /**
     * jqk 表示0.5, A 表示1
     *  其他转换为数字
     * @param face
     * @return
     */
  private static double conver(String face){
        if("A".equals(face)){
            return 1;
        }else if("J".equals(face)||"Q".equals(face)||"K".equals(face)){
            return 0.5;
        }else{
            return Double.parseDouble(face);
        }
  }

    /**
     *  计算机和人的面值比较，
     *   返回 1：人赢  0：面值相等  -1 计算机赢
     * @param computer
     * @param person
     * @return
     */
    private static int faceCompare(double computer,double person){
      if(computer>person){
          return -1;
      }else if(computer<person){
          return 1;
      }else{
          return 0;
      }
    }

    /**
     *    返回 1：人赢    -1 计算机赢
     * @param computer
     * @param person
     * @return
     */
    private static int suidCompare(String computer,String person){
        //红桃>黑桃>方片>梅花
        if("红桃".equals(computer)&&("黑桃".equals(person)||"方片".equals(person)||"梅花".equals(person))){
            return -1;
        }else if("黑桃".equals(computer)&&("方片".equals(person)||"梅花".equals(person))){
            return -1;
        }else if("方片".equals(computer)&& "梅花".equals(person)){
            return -1;
        }else{
            return 1;
        }

    }

    /**
     * 提供的公共的比较方法
     * 返回1 -1
     * @param computer
     * @param person
     * @return
     */
    public static int compare(Card computer,Card person){
        int facecom=faceCompare(conver(computer.getFace()),conver(person.getFace()));
        if(facecom==0){
            int suidcom=suidCompare(computer.getSuid(),person.getSuid());
            return suidcom;
        }else{
            return facecom;
        }
    }



}
