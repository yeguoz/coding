package com.test3.demo3;

public class Lecturer extends Teacher{//教研部讲师

    public Lecturer(){

    }

    public Lecturer(String id, String name, String job ){
        super(id,name,job);
    }

    @Override
    public void work(){
        System.out.println("讲课");
    }


}
