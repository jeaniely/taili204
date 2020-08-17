package com.neuedu.exception.two;

public class ExceptionExample {
    /**
     * 空指针，下标越界异常，RuntimeException ，Exception；
     * @param args
     */
    public static void main(String[] args) {
        int[] array=new int[5];

        try {
            array[5] = 89;
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (RuntimeException e){
            System.out.println("RuntimeException");
        } catch(Exception e){
            System.out.println("Exception");
        }
    }
}
