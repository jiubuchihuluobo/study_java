package com.tesla;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        // 需要确定真的开始位置
        int real_start = start < end ? start : end;
        int real_end = start > end ? start : end;
        int count = 0;
        for (int i = real_start; i <= real_end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count += 1;
            }
        }
        System.out.println(real_start + "到" + real_end + "之间" + "一共有" + count + "个既能被3整除也能被5整除的数");
    }
}
