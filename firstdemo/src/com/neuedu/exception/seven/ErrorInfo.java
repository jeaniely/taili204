package com.neuedu.exception.seven;

public enum ErrorInfo {
    UERNAME_OR_PASSWORD_ERR(0,"用户名或者密码有误"),
    USER_ONT_LOGIN_ERR(1,"用户未登录"),
    GOOGS_INSERT_ERR(2,"商品添加有误");


    private int code;
    private String information;
    private ErrorInfo(int code,String information){
        this.code=code;
        this.information=information;
    }

    public int getCode() {
        return code;
    }

    public String getInformation() {
        return information;
    }
}
