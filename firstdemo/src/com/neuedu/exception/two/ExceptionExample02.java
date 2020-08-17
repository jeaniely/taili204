package com.neuedu.exception.two;

public class ExceptionExample02 {
    /*
    * 1：捕获异常
    *    try{
    *      可能发成异常的代码
    *   }catch(可能发生的异常类 参数){
    *      处理异常
    * }
    * 2：多个异常
    *    1）同一级别异常，部分先后
    *    2）不是同一级别的异常，先写子类，再写父类
    * 3: finally
    * 4: 执行顺序
    * */
    public static void main(String[] args) {

        int[] array=new int[5];

        try {
            array[5] = 89;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("继续执行");
    }
}
