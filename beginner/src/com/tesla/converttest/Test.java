package com.tesla.converttest;

public class Test {
    public static void main(String[] args) {
        // 装箱

        // 不必要的装箱
        Integer intObj1 = new Integer(666);
        // Integer intObj1 = Integer.valueOf(666);
        System.out.println(intObj1);

        // 必要的装箱
        Integer intObj2 = new Integer("777");
        // Integer intObj2 = Integer.valueOf("666");
        // 重写了toString方法所以不输出地址值
        System.out.println(intObj2);

        // 拆箱
        // 不必要的拆箱
        int result1 = intObj1.intValue();
        System.out.println(result1);
        int result2 = intObj2.intValue();
        System.out.println(result2);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
