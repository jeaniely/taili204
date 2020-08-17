package com.neuedu.api.object0804.example01;

import java.io.*;

public class BufferedInputOutputStreamExample {
    /**
     *实现文件 复制
     * 从d:/demo将timg.jfif 复制到d:/demo/dir文件中
     * @param args
     */
    public static void main(String[] args) {
        /**
         *  1：提取文件数据
         *     1）找到文件
         *     2）生成文件字节输入流
         *     3） 生成缓冲输入流
         *     4） 提取数据
         *
         * 2 ：将源数据放入新文件中
         *    1） 创建新的文件，文件名与源文件名相同
         *    2） 生成文件字符输出流
         *    3）生成缓冲输出流
         *    4） 将数据写上到新文件中
         *
         * 3：关闭
         *
         */

        File s=new File("d:/demo/timg.jfif");
         if(!s.exists()){
             System.out.println("文件不存在，不能进行读取！");
             return;
         }


        FileInputStream fis=null;

        BufferedInputStream bis=null;

        try {
            fis=new FileInputStream(s);
            bis=new BufferedInputStream(fis);
            //bis.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        File d=new File("d:/demo/dir",s.getName());
        if(!d.exists()){
            try {
                d.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        FileOutputStream fos=null;
        BufferedOutputStream bos=null;
        try {
            fos=new FileOutputStream(d);
            bos=new BufferedOutputStream(fos);

            byte[] b=new byte[1024];

           int length= bis.read(b);

            while(length!=-1){
                bos.write(b,0,length);
                length=bis.read(b);
            }
            bos.flush();




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            bos.close();
            bis.close();
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
// 移动
      /*  s.delete();*/

    }
}
