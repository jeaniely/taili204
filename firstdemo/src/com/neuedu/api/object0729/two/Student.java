package com.neuedu.api.object0729.two;

public class Student implements Comparable<Student> {
    private  String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {/*比如，对姓名进行排序，实现字符排序,升序*/
        //如果姓名相同，采用年龄排序
        int k=this.getName().compareTo(o.getName());
        if(k==0){
            return this.getAge().compareTo(o.getAge());
        }else{
            return k;
        }


    }
}
