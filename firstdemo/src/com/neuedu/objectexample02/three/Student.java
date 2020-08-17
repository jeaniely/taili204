
package com.neuedu.objectexample02.three;

public abstract class Student {
    private String sid;
    private String name;
    private String sex;
    private int age;
    private double score;
    private double finalTerm;
    private double middleTerm;

    public Student(){}
    public Student(String sid,String name,String sex,int age,double finalTerm,double middleTerm){
        this.sid=sid;
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.middleTerm=middleTerm;
        this.finalTerm=finalTerm;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public double getFinalTerm() {
        return finalTerm;
    }

    public void setFinalTerm(double finalTerm) {
        this.finalTerm = finalTerm;
    }

    public double getMiddleTerm() {
        return middleTerm;
    }

    public void setMiddleTerm(double middleTerm) {
        this.middleTerm = middleTerm;
    }


    public abstract double getScore();
    public abstract void showAll();

    @Override
    public String toString() {
        return "学号："+sid+"姓名："+name+"性别："+sex+"年龄："+age;
    }
}
