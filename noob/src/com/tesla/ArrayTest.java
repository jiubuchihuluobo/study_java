package com.tesla;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 4};
        int a = 0;

        while (a < array.length) {
            System.out.println(array[a]);
            a += 1;
        }
        a = 0;

        do {
            System.out.println(array[a]);
            a++;
        } while (a < array.length);

        for (a = 0; a < array.length; a++) {
            System.out.println(array[a]);
        }

        int count = 0;
        for (int i : array) {
            count += i;
        }
        System.out.println(count);
    }
}
