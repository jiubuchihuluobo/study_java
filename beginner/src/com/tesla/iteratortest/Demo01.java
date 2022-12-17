package com.tesla.iteratortest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        // 定义一个储存String类型的ArrayList
        List<String> collection = new ArrayList<String>();
        collection.add("张三");
        collection.add("李四");
        collection.add("王五");
        collection.add("赵六");
        collection.add("田七");
        // 删
        collection.remove("张三");

        // 查
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());

        for (String i : collection) {
            System.out.println(i);
        }

        Collections.sort(collection);
    }
}
