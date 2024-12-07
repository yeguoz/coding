package com.test3.demo4;

public class Cat extends Animal {

    public Cat(){

    }

    public Cat(int age,String color){
        super(age,color);
    }

    @Override
    public void eat(String something){
            System.out.println(getAge()+"岁的"+getColor()+"的猫咪"+
                    "眯着眼睛侧着头吃"+something);

    }
}
