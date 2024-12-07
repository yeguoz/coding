package com.test3.demo3;

public class Teacher extends Employee{//教研部员工

    public Teacher(){

    }

    public Teacher(String id, String name, String job ){
        super(id,name,job);
    }





    @Override
    public void work(){
        System.out.println("教学");
    }


}
