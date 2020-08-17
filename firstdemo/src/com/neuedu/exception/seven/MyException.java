package com.neuedu.exception.seven;

public class MyException extends Exception {
    private ErrorInfo errorInfo;
    public MyException(){}
    public MyException(ErrorInfo errorInfo){
        this.errorInfo=errorInfo;
    }

    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }
}
