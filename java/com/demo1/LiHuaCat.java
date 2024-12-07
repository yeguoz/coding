package com.demo1;

public class LiHuaCat extends Cat{

    public LiHuaCat(String name, int age) {
        super(name,age);
    }

    public LiHuaCat() {
    }


    @Override
    public void eat(){
        System.out.println("一只叫做"+getName()+","+getAge()+"的狸花猫" +
                "，正在吃鱼");
    }


}
