package com.tesla.streamtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> zhangList = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张三丰", "张翠山", "灭绝师太", "张翠山");
        for (String i : list) {
            if (i.startsWith("张")) {
                zhangList.add(i);
            }
        }
        // System.out.println(zhangList.size());

        // 过滤
        Stream<String> result = list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张");
            }
        });
        result.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("-------------------------------------------------------");

        // 流式
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));

        System.out.println("-------------------------------------------------------");

        String[] arr1 = {"1", "2", "3", "4", "5"};
        Stream<String> stream1 = Stream.of(arr1);
        Stream<Integer> processStream = stream1.map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });
        /*processStream.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });*/

        List<Integer> myList = processStream.collect(Collectors.toList());
        System.out.println(myList);

        // processStream.forEach(integer -> System.out.println(integer));
    }
}
