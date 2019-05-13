package com.sleep.codewars;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
            Date parse = simpleDateFormat.parse("2019-05-08T09:30:00.000Z");
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            instance.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            System.out.println("year = " + instance.get(Calendar.YEAR));
            System.out.println("month = " + (instance.get(Calendar.MONTH)+1));
            System.out.println("day = " + instance.get(Calendar.DAY_OF_MONTH));
            System.out.println("hour = " + instance.get(Calendar.HOUR_OF_DAY));
            System.out.println("minute = " + instance.get(Calendar.MINUTE));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
