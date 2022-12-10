package com.tesla.systemtest;


import java.util.Date;

public class Test {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[array1.length + 1];
        System.arraycopy(array1, 0, array2, 1, array1.length);
        long e = System.currentTimeMillis();
        System.out.println(e);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        long r = new Date().getTime();
        System.out.println(r);
        System.out.println(r - e);
    }
}
