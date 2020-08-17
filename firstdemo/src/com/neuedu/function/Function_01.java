package com.neuedu.function;

public class Function_01 {
    public static void main(String[] args) {
       /* Function function=new Function();
        int a=3,b=6;
        int sum=function.add(a,b);
        System.out.println(sum);*/

       int a=10;
       int[] b={2,5,3,6};
        System.out.println(a);
        for(int k:b){
            System.out.print(k+"   ");
        }

        new Function().fun(a,b);
        System.out.println();
        System.out.println("----------------------------");
        System.out.println(a);
        for(int k:b){
            System.out.print(k+"   ");
        }

    }
}

class Function{
    /**
     * 两个整数之和
     * @param a
     * @param b
     * @return
     */
  int add(int a,int b){
      return a+b;
  }

  void fun(int a,int[] b){
      a=4;
      /*b[0]=45;*/
      b=new int[2];
      b[0]=78;
  }

    void fun01(String  b){

    }
}