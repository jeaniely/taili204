package com.neuedu.exception.seven;

public class Test {
    /**
     * 1:先使用枚举，列出错误信息和错误编号
     * 2：定义异常类，参数--枚举类型
     * 3：处理--捕获异常
     * 4: 结果的处理使用对象
     *
     *
     */


    public static void main(String[] args) {
        String username="zhang";
        String password="123456";
        OutputObject outputObject=null;
        try {
            UseMyException.checkUserNameAndPassword(username, password);
        }catch (MyException e){
//            System.out.println(e.getErrorInfo().getInformation());
            outputObject=new OutputObject(e.getErrorInfo().getCode(),e.getErrorInfo().getInformation());
        }


        System.out.println(outputObject.getStatus()+"   "+outputObject.getError());

    }
}
