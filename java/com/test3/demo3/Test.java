package com.test3.demo3;

public class Test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("01","ceshi","Jiangshi");
        l.work();
        System.out.println(l.getId()+" "+l.getName()+" "+l.getJob());
        System.out.println();

        Tutor t = new Tutor();
        t.work();
        System.out.println();

        Maintainer m = new Maintainer();
        m.work();
        System.out.println();

        Buyer b  = new Buyer();
        b.work();

    }
}
