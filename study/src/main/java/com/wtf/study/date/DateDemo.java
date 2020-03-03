package com.wtf.study.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author wangtengfei
 * @since 2020/3/2 14:05
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        String nowDate="2019-12-26 21:27:15";

        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        String currDate=sdf.format(date);
        System.out.println(currDate);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,-1);
        String a=sdf.format(calendar.getTime());
        System.out.println(a);
        sdf.format(nowDate);
        System.err.println(nowDate);
    }
}
