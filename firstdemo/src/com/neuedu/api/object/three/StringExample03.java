package com.neuedu.api.object.three;

public class StringExample03 {
    public static void main(String[] args) {
        String str="http://www.baidu.com/list.do";
        int index=str.lastIndexOf("/");
        System.out.println(index);
        int endindex=str.lastIndexOf(".");
        System.out.println(endindex);

        String strsub=str.substring(index+1,endindex);//[index+1,endindex)
        System.out.println(strsub);
    }
}
