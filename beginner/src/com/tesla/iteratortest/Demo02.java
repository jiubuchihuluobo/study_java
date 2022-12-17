package com.tesla.iteratortest;

import java.util.LinkedList;

public class Demo02 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("张三");
        linkedList.add("李四");
        linkedList.add("王五");
        linkedList.add("赵六");
        linkedList.add("田七");

        // 增(特有)
        linkedList.addFirst("Tom");
        linkedList.addLast("Jerry");

        // 删(特有)
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.pop();

        // 查(特有)
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }
}
