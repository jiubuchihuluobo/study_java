package com.tesla.timetest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        Date date1 = new Date();
        // EEE MMM dd HH:mm:ss zzz yyyy
        System.out.println(date1.toString());

        Date date2 = new Date(0);
        System.out.println(date2.toString());

        Date date3 = new Date(1000);
        System.out.println(date3.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Date to String
        String formatTime = sdf.format(date1);
        System.out.println(formatTime);

        // String to Date
        // java: unreported exception java.text.ParseException; must be caught or declared to be thrown
        Date result = sdf.parse("2022-12-08 20:45:33");
        System.out.println(result);
    }
}