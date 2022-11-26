package com.apple.www;

public class ControlLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("工作" + i);
        }
    }
}
