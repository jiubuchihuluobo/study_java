package com.tesla.threadtest;

public class Test {
    public static void main(String[] args) {
        // 继承实现
        // MyThread mt = new MyThread();
        // mt.run();
        // mt.start();

        // 接口实现
        // MyThread1 mt1 = new MyThread1();
        // Thread t1 = new Thread(mt1);
        // t1.start();

        // 匿名内部类实现
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(i);
                }
            }
        });
        t1.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
        }
    }
}
