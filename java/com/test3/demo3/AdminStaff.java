package com.test3.demo3;

public class AdminStaff extends Employee{//行政部员工
    public AdminStaff( ){

    }

    public AdminStaff(String id, String name, String job ){
        super(id,name,job);
    }

    @Override
    public void work(){
        System.out.println("政治工作");
    }

}
