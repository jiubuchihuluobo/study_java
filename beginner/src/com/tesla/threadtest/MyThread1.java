package com.tesla.threadtest;

public class MyThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(i);
        }
    }
}
