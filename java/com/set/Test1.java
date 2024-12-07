package com.set;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",23);
        Student s2 = new Student("张三",23);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
