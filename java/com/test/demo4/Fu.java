package com.test.demo4;

public class Fu {
    String name;
    int age;

    public Fu() {
        System.out.println("fu");
    }

    public Fu(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类");
    }


}
