package com.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",22);
        Student s3 = new Student("wanwu",25);
        Student s4 = new Student("zhangsan",23);

        LinkedHashSet<Student> hs = new LinkedHashSet<>();

        System.out.println(hs.add(s2));
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        System.out.println(hs);
    }
}
