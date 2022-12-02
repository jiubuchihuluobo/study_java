package com.tesla.duotai;

public class Student extends Person {
    String room;
    String age;

    {
        age = "16";
    }

    public Student() {
        System.out.println("学生类空参构造方法");
    }

    public Student(String name, String age, String room) {
        super();
        this.room = room;
    }

    public static void test() {
        System.out.println("学生静态方法测试");
    }

    @Override
    public void status() {
        System.out.println("study english");
    }
}
