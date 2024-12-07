package com.test3.demo3;

public class Buyer extends AdminStaff{//行政部的采购专员

    public Buyer(){

    }

    public Buyer(String id, String name, String job ){
        super(id,name,job);
    }

    @Override
    public void work(){
        super.work();
        System.out.println("采购工作");
    }
}
