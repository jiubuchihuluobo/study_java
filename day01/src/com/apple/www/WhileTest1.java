package com.apple.www;

public class WhileTest1 {
    public static void main(String[] args) {
        int count = 0;
        double i = 0.1;
        while (i < 8844430) {
            i += i;
            count++;
            System.out.println(i);
        }
        System.out.println(count);
    }
}
