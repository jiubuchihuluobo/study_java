package com.tesla;

/**
 * @author qiliu
 */
public class Person {
    String name;
    String country;

    //抽象类也需要构造方法
    //本身不能实例化所以初始化方法本身不会执行
    public Person() {

    }

    //抽象类也需要构造方法
    //本身不能实例化所以初始化方法本身不会执行
    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }

    //抽象方法必须被重写
    //本身不能实例化所以初始化方法本身不会执行
    //非抽象类中不能实现抽象方法
    //public abstract void eat();


    //    @Override
    public void eat() {
        System.out.println("\n父类中的eat方法");
    }
}
