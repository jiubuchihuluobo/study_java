package com.tesla.duotai;

public class Teacher extends Person {
    String department;
    String age;

    {
        age = "23";
    }


    public Teacher() {
        System.out.println("教师类空参构造方法");
    }

    public Teacher(String name, String age, String department) {
        super(name, age);
        this.department = department;
    }

    public static void test() {
        System.out.println("老师静态方法测试");
    }

    @Override
    public void status() {
        System.out.println("teach english");
    }
}
