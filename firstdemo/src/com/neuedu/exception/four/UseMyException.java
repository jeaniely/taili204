package com.neuedu.exception.four;

public class UseMyException {

    public static void checkString(String str) throws MyException {
        if(str==null){
            throw  new MyException("空字符");
        }else if("neuedu".equals(str)){
            throw  new MyException("两个字符串相等");
        }
    }
}
