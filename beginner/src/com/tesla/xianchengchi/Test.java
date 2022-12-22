package com.tesla.xianchengchi;

import java.util.concurrent.*;

public class Test {
    // 并发
    public static ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<>();

    // 普通
    // public static HashMap<String, String> hashMap = new HashMap<>();

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        Future<?> result1 = threadPool.submit(() -> {
            for (int i = 0; i < 20000; i++) {
                hashMap.put(String.valueOf(i), "hello");
            }
        });

        Future<?> result2 = threadPool.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 20000; i < 40000; i++) {
                    hashMap.put(String.valueOf(i), "hello");
                }
            }
        });

        Future<String> result3 = threadPool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Hello World";
            }
        });

        while (true) {
            if (result1.isDone() & result2.isDone()) {
                System.out.println(hashMap.size());
                System.out.println(result3.get());
                break;
            } else {
                continue;
            }
        }
    }
}
