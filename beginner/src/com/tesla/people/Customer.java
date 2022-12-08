package com.tesla.people;

public class Customer extends Person {
    public Customer() {

    }

    public Customer(String name, String country) {
        super(name, country);
    }

    @Override
    public String toString() {
        System.out.println("toString");
        return super.toString();
    }

    public void eat() {
        System.out.println("\n四菜一汤");
    }
}