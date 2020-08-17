package com.neuedu.api.object0731.entry;

import java.util.ArrayList;
import java.util.List;

public class PackOfCards {
  private  List<Card> packOfCardsList;

  public PackOfCards(){
      this.packOfCardsList=setPackOfCardsList();
  }

    /**
     * 一副牌的生成
     * @return
     */
  private List<Card> setPackOfCardsList(){
      String[] suids={"红桃","黑桃","方片","梅花"};//自行枚举
      String[] faces={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
      List<Card> list=new ArrayList<>();
      for (int i=0;i<suids.length;i++){
          for(int j=0;j<faces.length;j++){
              Card card=new Card(suids[i],faces[j]);
              list.add(card);
          }
      }
    return list;
  }

    /**
     * 对外提供的方法
     * @return
     */
    public List<Card> getPackOfCardsList() {
        return packOfCardsList;
    }






}
