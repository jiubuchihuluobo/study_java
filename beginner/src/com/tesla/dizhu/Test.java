package com.tesla.dizhu;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {

        // 扑克的普通部分
        ArrayList<String> simple = new ArrayList<>();
        Collections.addAll(simple, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        // 扑克的图片部分
        ArrayList<String> complex = new ArrayList<>();
        Collections.addAll(complex, "♠", "♥", "♣", "♦");

        // 索引
        ArrayList<String> index = new ArrayList<>();

        // 扑克
        int n = 0;
        HashMap<String, String> poker = new HashMap<>();
        for (String simple_tag : simple) {
            for (String complex_tag : complex) {
                index.add(String.valueOf(n));
                poker.put(String.valueOf(n++), complex_tag + simple_tag);
            }
        }

        // 特殊
        index.add(String.valueOf(n));
        poker.put(String.valueOf(n++), "大王");
        index.add(String.valueOf(n));
        poker.put(String.valueOf(n), "小王");

        // 洗牌
        Collections.shuffle(index);

        // 发牌
        ArrayList<String> people1 = new ArrayList<>();
        ArrayList<String> people2 = new ArrayList<>();
        ArrayList<String> people3 = new ArrayList<>();
        ArrayList<String> set = new ArrayList<>();
        int z = 0;
        for (String i : index) {
            if (z < 17) {
                people1.add(i);
            } else if (z < 34) {
                people2.add(i);
            } else if (z < 51) {
                people3.add(i);
            } else {
                set.add(i);
            }
            z++;
        }

        // 排序
        Collections.sort(people1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });
        Collections.sort(people2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });
        Collections.sort(people3, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });
        Collections.sort(set, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });

        lookPoker(people1, poker);
        lookPoker(people2, poker);
        lookPoker(people3, poker);
        lookPoker(set, poker);
    }

    public static <E> void lookPoker(@NotNull ArrayList<E> indexList, HashMap<E, E> pokerMap) {
        ArrayList<E> poker = new ArrayList<>();
        for (E i : indexList) {
            poker.add(pokerMap.get(i));
        }
        System.out.println(poker);
    }
}
