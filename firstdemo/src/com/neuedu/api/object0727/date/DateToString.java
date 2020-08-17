package com.neuedu.api.object0727.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {
    public static Date getDateByString(String dateString){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=null;

        try {
            date=sdf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }
    public static Date getDateByString(String pattern,String dateString){
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        Date date=null;

        try {
            date=sdf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    public static String getStringbyDate(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public static String getStringbyDate(String pattern,Date date){
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

}
