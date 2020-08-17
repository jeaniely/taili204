package com.neuedu.exception.seven;

public class UseMyException {

    public static void checkUserNameAndPassword(String username,String password) throws MyException {

        if("neuedu".equals(username) && "123456".equals(password)){

        }else{
            throw  new MyException(ErrorInfo.UERNAME_OR_PASSWORD_ERR);
        }
    }
}
