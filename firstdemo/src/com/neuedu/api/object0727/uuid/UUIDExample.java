package com.neuedu.api.object0727.uuid;

import java.util.Date;
import java.util.UUID;

public class UUIDExample {
    public static void main(String[] args) {
        /**
         * int
         * id 使用字符类型
         * 自定义
         *   A：编码的命名规则
         *      比如  第一部分s表示生活用品，e表示食品，。。。。。。
         *      第二部分表示时间
         *      第三部分 01，02，03
         *      s152456788901
         *    B：没有规则的
         *
         */

        String id=new Date().getTime()+"";
        System.out.println(id);
        String uuid=UUID.randomUUID().toString();
        System.out.println(uuid);
        String uuids=uuid.replace("-","");
        System.out.println(uuids);

    }
}
