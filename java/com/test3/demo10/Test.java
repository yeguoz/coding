package com.test3.demo10;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        method(d);

        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("猫吃鱼");
                    }
                }
        );

       //实现接口的对象，实现接口多态
       Swim s = new Swim(){
            String str="ceshi";
            @Override
            public void swim(){
                System.out.println("重写后游泳方法");
            }
        };

       s.swim();
        new Swim() {
            String str = "ceshi";

            @Override
            public void swim() {
                System.out.println("重写后游泳方法2");
            }
        }.swim();


    }
    public static void method(Animal a){
        a.eat();
    }
}
