package com.tesla.people;

public class Test {
    public static void main(String[] args) {
        Seller sp1 = new Seller("Tom", "CHINA", "seller");
        Seller sp2 = new Seller("Jerry", "CHINA", "cleaner");

        Customer c1 = new Customer("Tylor", "USA");

        // System.out.println(String.format("名字是:%s", sp.name));
        System.out.printf("名字是:%s%n国籍是:%s%n职责是:%s", sp1.name, sp1.country, sp1.responsibility);
        sp1.eat();
        System.out.printf("%n");
        System.out.printf("名字是:%s%n国籍是:%s%n职责是:%s", sp2.name, sp2.country, sp2.responsibility);
        sp2.eat();
        System.out.println();
        System.out.printf("名字是:%s%n国籍是:%s", c1.name, c1.country);
        c1.eat();
    }
}