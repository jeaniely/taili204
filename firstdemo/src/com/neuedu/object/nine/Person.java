package com.neuedu.object.nine;

/**
 *  接口：
 *     关键词 interface
 *  包括：1）抽象方法
 *        public abstract 可以省略
 *        2）常量
 *        public static final 可以省略
 *        3）static|default 方法
 *         static void jump(){
 *
 *     }
 *     default  void cry(){
 *
 *     }
 *
 *  子类： 普通类 implements  ，必须实现接口中的抽象方法
 *         抽象类 implements 可以实现可不实现
 *         接口  extends   不实现抽象方法
 *
 *
 *   接口不能使用接口直接实例化，可以采用普通子类来实例化
 *
 * 类： 单继承，多实现
 *
 *
 * 作业：抽象类和接口的应用场景
 *
 *
 */
public interface Person {
    /* String NAME="max";*/
    void eat();
    public abstract  void sleep();

}
