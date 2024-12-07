package com.test3.demo4;

public class Test {
    public static void main(String[] args) {
        Person p = new Person(22,"王");

        Cat c = new Cat(20,"粉色");

        Dog d = new Dog(30,"黄色");

        p.keepPet(c,"yu骨头");

        p.keepPet(d,"狗是");

    }
}
