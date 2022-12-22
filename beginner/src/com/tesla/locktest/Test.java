package com.tesla.locktest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    // Class<Test> lock = Test.class;

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        threadPool.submit(new Runnable() {
            @Override
            public void run() {
                synchronized (Test.class) {
                    System.out.println("开始执行");
                    System.out.println("等待");
                    try {
                        Test.class.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("重新开始执行");
                }

            }
        });

        threadPool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始激活");
                synchronized (Test.class) {
                    Test.class.notify();
                }
            }
        });
    }
}
