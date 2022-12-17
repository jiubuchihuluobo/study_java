package com.tesla.iteratortest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo03 {
    public static void main(String[] args) {
        // 定义一个储存String类型的ArrayList
        Collection<String> collection = new ArrayList<String>();
        collection.add("张三");
        collection.add("李四");
        collection.add("王五");
        collection.add("赵六");
        collection.add("田七");

        Iterator<String> iterator = collection.iterator();
        /*while (true) {
            if (!iterator.hasNext()) {
                break;
            }
            System.out.println(iterator.next());
        }*/
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
