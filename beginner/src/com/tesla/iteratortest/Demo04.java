package com.tesla.iteratortest;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo04 {
    public static void main(String[] args) {
        // 定义一个储存任意类型的ArrayList
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add(10);
        arrayList.add(true);
        arrayList.add(8.8);
        Iterator<Object> iterator1 = arrayList.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
