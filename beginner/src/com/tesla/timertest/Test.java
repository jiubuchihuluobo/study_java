package com.tesla.timertest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Test {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormat.parse("2022-12-22 17:52:00");

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("任务1执行");
            }
        }, 3000);

        /*timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("任务2执行");
            }
        }, 3000, 3000);*/

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("任务3执行");
            }
        }, date, 2000);

    }
}
