package com.neuedu.exception.five;

public class UseMyException01 {
    public static void checkString(String  str){
        if(str==null){
            throw new MyException01("空字符");
        }else if("neuedu".equals(str)){
            throw  new MyException02("相同字符");
        }
    }
}
