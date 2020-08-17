package com.neuedu.firsthomeword;

public class HomeWord {

    /**
     *   1:数组的初始化
     *   2：for 双重循环
     *   3：if
     *   4：foreach输出
     *   5：数据类型的选取
     *   6：转义字符的使用 \t
     * @param args
     */
    public static void main(String[] args) {
        int a[]={45,12,3,7,89,50};
        /*1:外循环，作为趟数*/
        for(int i=0;i<a.length-1;i++){
            /*2.内循环：数值比较*/
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    /*使用第三个参数进行交换*/
                    int k=a[j];
                    a[j]=a[j+1];
                    a[j+1]=k;
                    /*  a=3;b=4;
                                a   b
                    *   a=a+b; 7   4
                    *   b=a-b; 7     3
                    *   a=a-b;  4    3
                    *
                    * */
                }
            }
        }

         for(int k:a){
             System.out.print(k+"\t");
         }

    }

    /**
     * 1.冒泡排序  从小到大
     * 45 12 3 7 89 50   给了6个数，执行趟数 5
     * 第一趟： 12 3   7  45  50 89
     * 第二趟： 3  7 12  45   50 89
     *
     * 第三趟： 3 7 12 45  50 89
     * 第四趟： 3 7 12 45  50 89
     * 第五趟： 3 7 12 45  50 89
     *
     * */
}
