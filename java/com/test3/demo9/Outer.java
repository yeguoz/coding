package com.test3.demo9;

public class Outer {
    int a = 10;
    static int b = 20;

    static class Inner{
        public void show1(){
            Outer o = new Outer();
            System.out.println(o.a);
            System.out.println(b);
            System.out.println("非静态方法");
        }

        public static void show2(){
            System.out.println("静态方法");
        }
    }

}
