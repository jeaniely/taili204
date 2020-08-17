package com.neuedu.exception.seven;

public class OutputObject<T> {
    private int status;
    private String error;
    private T data;

    public OutputObject(int status,String error){
        this.status=status;
        this.error=error;
    }
    public OutputObject(int status,T data){
        this.status=status;
        this.data=data;
    }

    public int getStatus() {
        return status;
    }

    public String getError() {
        return error;
    }

    public T getData() {
        return data;
    }
}
