package com.demo1;

public class Teddy extends Dog{
    public Teddy() {
    }

    public Teddy(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("一只叫做"+getName()+","+getAge()+"的泰迪" +
                "，正在吃骨头，边啃边蹭");
    }
}
