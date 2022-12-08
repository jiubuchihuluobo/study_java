package com.tesla.calendartest;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow.toString());

        // 明年
        rightNow.add(Calendar.YEAR, 1);
        System.out.println(rightNow.getTime());
    }
}
