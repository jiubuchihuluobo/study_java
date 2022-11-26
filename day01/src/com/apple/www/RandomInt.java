package com.apple.www;

import java.util.Random;

public class RandomInt {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        System.out.println(num);
    }
}
