package com.test3.demo0;

public class Cat extends Animal{
    public void catchingMice(){
        System.out.println("捉老鼠");
    }

    @Override
    public void eat(){
        System.out.println("猫猫在吃饭");
        super.eat();
    }


}
