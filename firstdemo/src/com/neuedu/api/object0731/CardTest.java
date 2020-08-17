package com.neuedu.api.object0731;

import com.neuedu.api.object0731.controller.CardsController;
import com.neuedu.api.object0731.entry.Card;
import com.neuedu.api.object0731.entry.PackOfCards;

import java.util.List;
import java.util.Scanner;

public class CardTest {
    public static void main(String[] args) {
      menu();

    }

    /**
     * 一副牌玩3次游戏
     */
    public static void menu(){
        PackOfCards packOfCards=new PackOfCards();
        Scanner scanner=new Scanner(System.in);
        while (true) {
           /* PackOfCards packOfCards=new PackOfCards();*/
            //得到一副牌
            List<Card> cardList = packOfCards.getPackOfCardsList();
            CardsController.print(cardList);

            // 洗牌
            CardsController.shuffle(cardList);
            System.out.println("洗牌之后的数据");
            /*CardsController.print(cardList);*/

            //抽取牌
            Card personCard = null;
            //人抽牌
            personCard = CardsController.getPersonCard(cardList);
            System.out.println("人抽取的牌是：" + personCard);
            /*CardsController.print(cardList);*/

            Card computerCard = null;
            //计算机抽牌
            computerCard = CardsController.getComputerCard(cardList);
            System.out.println("计算机抽取的牌是：" + computerCard);
           /* CardsController.print(cardList);*/

            // 比较
            int result = CardsController.compare(computerCard, personCard);

            if (result == 1) {
                System.out.println("恭喜您赢了");
            } else {
                System.out.println("再接再励");
            }


            //一副牌玩三次之后，退出游戏
            if((52-cardList.size())/2==3){
                System.out.println("一副牌只能玩三次，现在已经3次，结束");
                break;
            }else{
                System.out.println("可以在玩"+(3-(52-cardList.size())/2));
            }


            System.out.println("是否继续：y|n");
            char ch=scanner.next().charAt(0);//提取一个char类型的数据
            if(ch=='n'){
                System.out.println("游戏结束！");
                break;
            }else{
                continue;
            }

        }
    }
}
