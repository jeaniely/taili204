package com.neuedu.object.six;

public class Test {
    /**
     * 重写：
     *    条件：1)子类继承或者实现父类
     *          2）方法名、参数、返回类型一致
     *          3）限定修饰符范围权限，子类要等于或者大于父类
     *
     *   @Override  注解
     *   1）告诉重写
     *   2）约束
     *   
     *
     * @param args
     */
    public static void main(String[] args) {
        Student student=new Student();
        student.eat();

        Teacher teacher=new Teacher();
        teacher.eat();

    }
}
