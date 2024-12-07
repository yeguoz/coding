package com.test3.demo3;

public class Tutor extends Teacher{//教研部助教

    public Tutor(){

    }

    public Tutor(String id, String name, String job ){
        super(id,name,job);
    }
    @Override
    public void work(){
        System.out.println("助教工作");
    }
}
