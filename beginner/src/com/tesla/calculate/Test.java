package com.tesla.calculate;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        // 加法
        BigDecimal bd1 = new BigDecimal("3.1415");
        BigDecimal bd2 = new BigDecimal("3.1411");
        System.out.println(bd1.add(bd2));

        // 减法
        BigDecimal bd3 = new BigDecimal("3.1415");
        BigDecimal bd4 = new BigDecimal("3.1411");
        System.out.println(bd3.subtract(bd4));

        // 乘法
        BigDecimal bd5 = new BigDecimal("3.1415");
        BigDecimal bd6 = new BigDecimal("3.1411");
        System.out.println(bd5.multiply(bd6));

        // 除法(除尽)
        BigDecimal bd7 = new BigDecimal("6.28");
        BigDecimal bd8 = new BigDecimal("3.14");
        System.out.println(bd7.divide(bd8));

        // 除法(除不尽)
        BigDecimal bd9 = new BigDecimal("9");
        BigDecimal bd10 = new BigDecimal("3.1");
        // scale 保留几位
        System.out.println(bd9.divide(bd10, 2, RoundingMode.HALF_UP));
    }
}
