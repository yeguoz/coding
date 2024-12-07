package com.test3.demo1;

public class Husky extends Dog{
    String name = "Husky";
    public void ChaiHome(){
        String name = "hs";
        System.out.println("拆家");
        System.out.println(super.name);
    }
}
