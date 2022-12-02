package com.tesla.people;

public class Seller extends Person implements InterfaceTest {
    String responsibility;
    boolean status;

    public Seller() {

    }

    public Seller(String name, String country, String responsibility) {
        super(name, country);
        this.responsibility = responsibility;
    }

    //subclass->parent->interface
    @Override
    public void eat() {
        System.out.println("\n子类中的eat方法");
    }

    @Override
    public void abs() {
        System.out.println("接口中的方法不用声明abstract");
    }
}
