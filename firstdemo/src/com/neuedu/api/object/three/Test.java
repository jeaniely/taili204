package com.neuedu.api.object.three;

public class Test {
    /**
     * 1: 字符串类
     *    不可变字符串：String
     *              不可变：final char value[];
     *              不可被继承：final class String
     *    可变字符串:StringBuffer                        StringBuilder
     *          版本    1.0                                   1.5
     *        线程安全性： 线程安全，适合多线程执行      线程不安全，适合于单线程
     *         性能        低                               高
     *2：案例1：字符串的比较
     *   案例2：输入电话号码：123-0506-7894
     *          显示：12305067894
     *
     *   案例3：http://www.baidu.com/list.do
     *         提取出字符串：list.do
     */
    public static void main(String[] args) {
        String str;
        StringBuilder sb;
        StringBuffer bf;

    }
}
