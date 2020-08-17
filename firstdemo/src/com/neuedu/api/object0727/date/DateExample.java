package com.neuedu.api.object0727.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        //Date 默认当前的时间
        Date date=new Date(5800);
        System.out.println(date);
        System.out.println((date.getYear()+1900));
        System.out.println(date.getMonth());
        System.out.println("毫秒数："+date.getTime());
        System.out.println("=============================");
       // Calendar
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(1));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("******************************");
        calendar.setTime(date);
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(1));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        // 日期或者时间是字符类型，转为日期类型
        System.out.println("==============================");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strdate="2020-07-12 14:25:14";

        try {
            Date date1=sdf.parse(strdate);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        //将日期类型转换为自定义格式类型进行输出

        String str=sdf.format(date);
        System.out.println(str);
        System.out.println("========================================");
        System.out.println(DateToString.getDateByString("2017-02-12 14:45:25"));
        System.out.println(DateToString.getDateByString("yyyy-MM-dd","2017-02-12"));
        System.out.println(DateToString.getStringbyDate(date));
        System.out.println(DateToString.getStringbyDate("yyyy-MM-dd",date));
        System.out.println("=========================");
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dateFormat1=DateFormat.getDateInstance();
    }
}
