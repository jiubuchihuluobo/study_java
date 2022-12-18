package com.tesla.threadtest;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
        }
    }
}
