package com.test3.demo2;

public class Test {
    public static void main(String[] args) {

        Manager m = new Manager("01","ls",2500.0,20000.0);
        System.out.println(m.getBonus());
        m.work();
        System.out.println(m.getSalary());

        Cook c = new Cook("02","zs",4000.0);
        c.work();
        System.out.println(c.getSalary());
    }
}
