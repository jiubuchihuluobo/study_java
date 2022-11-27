package com.apple.www;

public class ExchangeTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            // 时间复杂度最小
            if (num == array[array.length - (i + 1)]) {
                break;
            }
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = num;
        }
        for (int a : array) {
            System.out.println(a);
        }
    }
}
