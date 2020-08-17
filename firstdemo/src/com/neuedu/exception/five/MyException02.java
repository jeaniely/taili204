package com.neuedu.exception.five;

public class MyException02 extends  RuntimeException {
    private String msg;
    public MyException02(){}
    public  MyException02(String msg){
        super(msg);
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }
}
