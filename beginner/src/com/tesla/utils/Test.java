package com.tesla.utils;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("Tom", 10));
        arrayList.add(new Person("Jerry", 3));
        Collections.sort(arrayList);
        for (Person i : arrayList) {
            System.out.println(i.age);
        }
    }
}
