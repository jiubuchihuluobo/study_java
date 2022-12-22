package com.tesla.mythread;

public class Thread01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            Test.c.getAndIncrement();
        }
    }
}
