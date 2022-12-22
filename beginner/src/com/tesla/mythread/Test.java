package com.tesla.mythread;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static AtomicInteger c = new AtomicInteger(0);
    static volatile int z = 0;

    public static void main(String[] args) throws InterruptedException {
        // thread01线程
        Thread01 thread01 = new Thread01();
        thread01.start();

        // 主线程
        for (int i = 0; i < 100000; i++) {
            c.getAndIncrement();
        }

        Thread.sleep(2000);
        System.out.println(c.get());
    }
}
