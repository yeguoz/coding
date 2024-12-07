package com.test3.demo8;

public class Test {
    public static void main(String[] args) {
        Outer o = new Outer();

        Outer.Inner oi = new Outer().new Inner();
        oi.show();
        System.out.println(oi.str);
    }
}
