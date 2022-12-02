package com.tesla.duotai;

public class Person {
    String name;
    String age;

    {
        age = "3";
    }

    public Person() {
        System.out.println("父类空参构造方法");
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public static void test() {
        System.out.println("父类静态方法测试");
    }

    public void status() {
        System.out.println("父类状态");
    }
}
