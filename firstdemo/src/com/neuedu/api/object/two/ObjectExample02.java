package com.neuedu.api.object.two;

public class ObjectExample02 {
    /**
     *
     * byte    short  int   long   char  boolean  float  double
     *
     * Byte  Short  Integer Long Character Boolean Float Double
     *
     * 1) 实体类中，成员变量的数据类型，采用包装类 （建议）
     *     如：int level ； 0 1 2  规定了一下
     *         现在不知道level的值，不先写，但是int的默认0
     *         使用包装类：Integer  null
     *
     * 2）基本数据类型和包装类的转换
     *      自动装箱
     *      自动拆箱
     *
     * 3) 字符串转化为基本数据类型或者包装类
     *
     *
     *
     */
    public static void main(String[] args) {
        int int1=12;

        Integer it1=int1;//自动装箱

        int int2=it1;//自动拆箱

     // 字符串--》基本数据类型
      String str="12346";//数字字符串
        int int3=Integer.parseInt(str);

        // 字符串--》包装类
        Integer it2=new Integer(str);
        Integer it3=Integer.valueOf(str);
//        数值比较

        Integer it4=127;
        Integer it5=127;
        Integer it6=128;
        Integer it7=128;
        System.out.println(it4==it5);
        System.out.println(it6==it7);
        System.out.println("==========");
        System.out.println(it4.equals(it5));
        System.out.println(it6.equals(it7));

       /* Double dou;*/

    }





}
