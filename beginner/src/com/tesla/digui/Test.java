package com.tesla.digui;

public class Test {
    public static void main(String[] args) {
        b(1);

    }

    public static void a() {
        System.out.println('1');
    }

    private static void b(int i) {
        System.out.println(i);
        if (i == 10000) {
            return;
        }
        b(++i);
    }
}