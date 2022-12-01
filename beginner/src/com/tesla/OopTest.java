package com.tesla;

public class OopTest {
    public static void main(String[] args) {
        SalesPerson sp1 = new SalesPerson("Tom", "CHINA", "seller");
        SalesPerson sp2 = new SalesPerson("Jerry", "CHINA", "cleaner");

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