package com.apple.www;

import java.util.Scanner;

public class GeneralTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个");
        int a = sc.nextInt();
        System.out.println("第二个");
        int b = sc.nextInt();
        int c = a + b;
        boolean status = a == 6 || b == 6 || c % 6 == 0;
        System.out.println(status);
    }
}
