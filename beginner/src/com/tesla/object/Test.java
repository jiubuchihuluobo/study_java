package com.tesla.object;

import com.tesla.people.Customer;

public class Test {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        System.out.println(c1.getClass());
        System.out.println(c1.getClass().getName());

    }
}