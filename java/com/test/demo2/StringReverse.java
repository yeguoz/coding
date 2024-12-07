package com.test.demo2;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(reverse(str));
    }

    public static String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }


}
