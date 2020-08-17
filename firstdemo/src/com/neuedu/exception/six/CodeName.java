package com.neuedu.exception.six;

public enum CodeName {
    OK(200,"成功"),
    REQUEST_ERR(404,"页面显示不处理"),
    SERVER_ERR(500,"服务器错误");


    private int code;
    private String name;
    private CodeName(int code,String name){
        this.code=code;
        this.name=name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static String getName(int code) {
        for(CodeName cn:CodeName.values()){
            if(cn.getCode()==code){
                return cn.getName();
            }
        }
        return null;
    }
}
