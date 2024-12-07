package com.set;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",23);
        Student s2 = new Student("里斯",25);
        Student s3 = new Student("王五",24);
        Student s4 = new Student("zhao",19);


        TreeSet<Student> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        System.out.println(ts);
    }
}
