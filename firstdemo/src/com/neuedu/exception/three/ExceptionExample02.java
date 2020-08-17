package com.neuedu.exception.three;

import java.io.IOException;

public class ExceptionExample02 {
    public static void main(String[] args) {

        String str=null;
        if("neuedu".equals(str)){
          throw new RuntimeException("同一字符串");
        }else if(str==null) {
            try {
                throw new IOException("字符串为空");
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getCause());
                e.printStackTrace();
                System.out.println("=======");
                System.out.println(e.toString());
            }

        }
    }
}
