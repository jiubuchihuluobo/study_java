package com.tesla.iteratortest;

import java.util.ArrayList;
import java.util.List;

public class Demo05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("田七");
        // 删
        String result1 = list.remove(0); // List Interface
        System.out.println(result1);
        boolean result2 = list.remove("Tom"); // Collection Interface
        System.out.println(result2);
        // 改
        list.set(0, "Tom");

        // 查
        System.out.println(list.get(2));

        System.out.println("--------------------------------------");
        for (String i : list) {
            System.out.println(i);
        }
    }
}
