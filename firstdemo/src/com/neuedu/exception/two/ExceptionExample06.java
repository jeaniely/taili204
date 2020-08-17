package com.neuedu.exception.two;

public class ExceptionExample06 {
    public static void main(String[] args) {
        int[] array=new int[5];

        try {
            array[4] = 89;
            int k=34;
            System.out.println(k);
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (RuntimeException e){
            System.out.println("RuntimeException");
        } catch(Exception e){
            System.out.println("Exception");
        }finally {
            System.out.println("无论是否发生异常，都会执行finally中的语句");
        }
        System.out.println("继续执行");
    }
}
