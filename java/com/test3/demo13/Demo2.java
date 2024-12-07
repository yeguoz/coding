package com.test3.demo13;

public class Demo2 {
    public static void main(String[] args) {
        String str = "123456789";
        int num = 0 ;

        if (!str.matches("[1-9]\\d{0,9}")){
            System.out.println("数据有误");
        }else {

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                int n = c - '0';
                num = num * 10 + n;
            }
        }
        System.out.println(num);
        System.out.println(num+1);
    }
}
