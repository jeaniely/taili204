package com.neuedu.firsthomeword;

public class HomeWord02 {
    /**
     * 1:注释
     *      单行注释//
     *     多行注释
     *     文档注释
     * 2：for双重循环
     * 3： break
     * 4：boolean 变量使用
     * 5 ：%
     * 6： if
     * @param args
     */
    public static void main(String[] args) {

        int num=0;

        for(int n=200;n<500;n++){
            boolean flag=true;
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    flag=false;
                    break;
                }
            }

            if(flag){
                System.out.print(n+"\t");//

                num++;/*数据的统计*/
                if(num%5==0){/*统计的数值能够整除5/10，则换行*/
                    System.out.println();/*换行System.out.print("\n")*/
                }

            }



        }




    }
    /*
    * 2: 查询出200-500之间的所有素数，并输出 ，每10数一行
    *   1）什么是素数
    *     1和本身整除的数
    *     2 3 5 7 11.。。
    *    //内循环
    *     boolean flag=true;//开始判断这是数是素数
    *     for(int i=2;i<n;i++){  2.....n-1
    *         if(n%i==0){
    *            flag=false;
    *            break;
    *         }
    *      }
    *
    * 2) for(int n=200;n<500;n++){//外循环
    *
    *    }
    *
    * 3）输出
    *     if(flag){
    *      sout(n);
    *     }
    *
    * */
}
