package com.apple.www;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        if (result >= 100) {
            System.out.println("吃蛋挞");
        } else {
            System.out.println("没钱");
        }
    }
}
