package com.tesla.people;

public interface InterfaceTest {
    String test = "接口中的默认方法";

    //抽象方法
    //隐式声明public abstract
    void abs();

    //默认方法可以不被实现
    default void df() {
        System.out.println(test);
    }

    default void eat() {
        System.out.println("\n接口中的eat方法");
    }
}
