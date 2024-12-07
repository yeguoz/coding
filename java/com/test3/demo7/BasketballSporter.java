package com.test3.demo7;

public class BasketballSporter extends Sporter{


    public BasketballSporter() {
    }

    public BasketballSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study(){
        System.out.println("学篮球");
    }



}
