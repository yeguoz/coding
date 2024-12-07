package com.test3.demo8;

public class Outer {
    private  int a = 10;

    public class Inner{
        String str = "c";

        public void show(){
            System.out.println(Outer.this.a);
        }
    }


}
