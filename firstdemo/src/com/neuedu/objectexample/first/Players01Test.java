package com.neuedu.objectexample.first;

public class Players01Test {
    public static void main(String[] args) {
        while(true){
            Players01 players01=Players01.create();
            if(players01 != null){
                continue;
            }else{
                System.out.println("对不起，11个创建完成，不能再创建了");
                break;
            }
        }
    }
}
