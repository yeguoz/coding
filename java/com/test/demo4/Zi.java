package com.test.demo4;

public class Zi extends Fu{
    public Zi(){
        System.out.println("zilei");
    }
    public Zi(String name,int age){
        super(name,age);
        System.out.println("子类");
    }
}
