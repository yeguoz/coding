package com.test3.demo13;

import java.util.Scanner;

public class IntegerDemo {
    public static void main(String[] args) {

        Integer i = 12;
        Integer a = 3;
        int x = i+a;
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int c = Integer.parseInt(line);
        System.out.println(c);
    }
}
