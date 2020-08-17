package com.neuedu.api.object.three;

public class StringExample02 {
    public static void main(String[] args) {
        /**
         * http://www.baidu.com/list.do
         *  A:提取出字符串：list.do
         *  1)substring
         *  2) beginindex怎么求？
         *
         * B:提取出字符串：list
         */
        String str="http://www.baidu.com/list.do";
        int index=str.lastIndexOf("/");
        System.out.println(index);

        String substr=str.substring(index+1);
        System.out.println(substr);

    }
}
