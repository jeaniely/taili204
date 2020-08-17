package com.neuedu.exception.five;

public class MyException01  extends RuntimeException{
    private String message;

    public MyException01(){}
    public MyException01(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
