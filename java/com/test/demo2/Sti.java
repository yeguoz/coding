package com.test.demo2;

public class Sti {
    public static void main(String[] args) {
        String s1 = "abc";
        String s3 = "a";
        String s2 = s3+"b"+"c";
        System.out.println(s1==s2);
    }
}
