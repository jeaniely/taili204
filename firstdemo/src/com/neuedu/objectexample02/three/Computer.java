package com.neuedu.objectexample02.three;

public class Computer extends Student {

    private double operation;
    private double englishWrite;

    public Computer(){}
    public Computer(String sid,String name,String sex,int age,double finalTerm,double middleTerm,double operation,double englishWrite){
        super(sid, name, sex, age, finalTerm, middleTerm);
        this.operation=operation;
        this.englishWrite=englishWrite;
    }

    public double getOperation() {
        return operation;
    }

    public void setOperation(double operation) {
        this.operation = operation;
    }

    public double getEnglishWrite() {
        return englishWrite;
    }

    public void setEnglishWrite(double englishWrite) {
        this.englishWrite = englishWrite;
    }

    @Override
    public double getScore() {
        return operation*.4+englishWrite*.2+getMiddleTerm()*0.2+getFinalTerm()*0.2;
    }

    @Override
    public void showAll() {
        System.out.println(super.toString()+"综合成绩"+getScore());
    }
}
