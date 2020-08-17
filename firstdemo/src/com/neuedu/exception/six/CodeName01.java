package com.neuedu.exception.six;

public enum  CodeName01 {
    OK(200){
        @Override
        public String getName() {
            return "成功";
        }
    },
    REQUEST_ERR(404){
        @Override
        public String getName() {
            return "页面显示有误";
        }
    };


    private int code;
    private  CodeName01(int code){
        this.code=code;
    }

    public int getCode() {
        return code;
    }

    public abstract String getName();
}
