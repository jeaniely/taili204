package com.neuedu.functionexample;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    private static <T extends Comparable> void merge(int left,int mid,int right,T[] array){
        ArrayList<T> tmp=new ArrayList<>(right-left);
        for(int k=left;k<=right;k++) tmp.add(k-left,array[k]);
        int i=left;
        int j=mid+1;
        for(int k=left;k<=right;k++) {
            if(i>mid) {
                array[k]=tmp.get(j-left);
                j++;
            }
            else if(j>right) {
                array[k]=tmp.get(i-left);
                i++;
            }
            else if(tmp.get(i-left).compareTo(tmp.get(j-left))>0) {
                array[k]=tmp.get(j-left);
                j++;
            }
            else {
                array[k]=tmp.get(i-left);
                i++;
            }
        }
    }

    private static <T extends Comparable> void merge_Sort(T[] array,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            merge_Sort(array,left,mid);
            merge_Sort(array,mid+1,right);
            merge(left,mid,right,array);
        }
    }

    public static <T extends Comparable> T[] mergeSort(T[] array){
        int left=0;
        int right=array.length-1;
        merge_Sort(array,left,right);
        return array;
    }

    public static void main(String[] args) {
        Integer[] a={7,5,2,8,9};
        mergeSort(a);
        for(Integer k:a) {
            System.out.println(k);
        }
    }

}
