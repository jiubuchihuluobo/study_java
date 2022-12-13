package com.tesla.innertest;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // 创建成员内部类对象
        Outer.Inner inner = new Outer().new Inner();
        System.out.println(inner);

        // 调用成员内部类Inner的show方法
        inner.show();

        // 调用外部类Outer的show方法
        outer.show();

        // 调用外部类Outer的identify方法
        outer.identify();
    }
}
