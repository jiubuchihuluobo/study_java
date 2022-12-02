package com.tesla.duotai;

public class Test {
    public static void main(String[] args) {
        //多态
        Person p1 = new Teacher();
        Person p2 = new Student();

        //父类引用子类对象
        System.out.println(p1);
        System.out.println(p2);

        //多态中的成员方法
        p1.status();
        p2.status();

        //多态中的成员变量找父类
        //只有成员方法可以被重写
        System.out.println(p1.age);
        System.out.println(p2.age);

        //多态中的静态方法
        //静态方法属于类
        p1.test();
        p2.test();

        //构造方法
        //先调用父类后调用子类
    }
}
