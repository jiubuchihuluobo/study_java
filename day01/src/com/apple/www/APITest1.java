package com.apple.www;

public class APITest1 {
    public static void main(String[] args) {
        ClassTest ct = new ClassTest("Jerry", 3);
        String result = String.format("%s:%d", ct.getName(), ct.getAge());
        System.out.println(result);
        ct.setName("Tom");
        ct.setAge(18);
        System.out.println(ct.getName());
        System.out.println(ct.getAge());
    }
}
