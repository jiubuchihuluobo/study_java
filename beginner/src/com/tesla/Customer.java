package com.tesla;

public class Customer extends Person {
    public Customer() {

    }

    public Customer(String name, String country) {
        super(name, country);
    }

    public void eat() {
        System.out.println("\n四菜一汤");
    }

}
