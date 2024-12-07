package com.set;

import java.util.TreeSet;

public class Student2Test {
    public static void main(String[] args) {
        Student2 s1 = new Student2("zhangsan",23,90,99,50);
        Student2 s2 = new Student2("lisi",24,90,98,50);
        Student2 s3 = new Student2("wangwu",25,95,100,30);
        Student2 s4 = new Student2("qianqi",26,70,80,70);

        TreeSet<Student2> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        System.out.println(ts);

    }
}
