package com.apple.www;

public class SortTest {
    public static void main(String[] args) {
        int[] array = {-1, 10, 43, 5, 47, 2, 100, 41, 200, 9, 21};
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            for (int n = i + 1; n < array.length; n++) {
                if (array[n] > max) {
                    // 更新
                    max = array[n];
                    // 交换位置
                    array[n] = array[i];
                    array[i] = max;
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
