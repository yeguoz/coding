package com.test3.demo3;

public class Maintainer extends AdminStaff{//行政部的维修专员

    public Maintainer(){

    }

    public Maintainer(String id, String name, String job ){
        super(id,name,job);
    }


    @Override
    public void work(){
        System.out.println("维修工作");
    }
}
