package com.test3.demo6;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("小灰",3);
        d.eat();
        d.swim();
        System.out.println();

        Frog f = new Frog("小青",2);
        f.eat();
        f.swim();
        System.out.println();

        Rabbit r = new Rabbit("小白",1);
        r.eat();
        System.out.println();
        System.out.println(Swim.STR);
        System.out.println("================");

    }
}
