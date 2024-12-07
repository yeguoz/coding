package com.test3.demo12;

public class RegexDemo1 {
    public static void main(String[] args) {
        System.out.println("+".matches("\\+"));
        System.out.println("\\+"+"a");

        String regex1 = "/^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$/";
    }
}
