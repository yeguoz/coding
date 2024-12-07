package com.test3.demo4;

public class Dog extends Animal{

    public Dog(){

    }

    public Dog(int age,String color){
        super(age,color);
    }


    public void lookHome(){
        System.out.println("看家");
    }
    @Override
    public void eat(String something){

            System.out.println(getAge()+"岁的"+getColor()+"的狗"+
                    "两只前腿抱着"+something+"猛吃");


    }
}
