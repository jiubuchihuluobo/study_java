package com.tesla;

import java.util.Random;

public class UpsetArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int r = random.nextInt(array.length);
            // 交换而不是覆盖
            int origin = array[i];
            array[i] = array[r];
            array[r] = origin;
        }
        for (int a : array) {
            System.out.println(a);
        }
    }
}
