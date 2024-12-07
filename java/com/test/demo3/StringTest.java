package com.test.demo3;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true){
            sb.setLength(0);
            System.out.println("请输入一个字符串数字");
            String sIn = sc.next();
            boolean flag = legal(sIn);
            if(flag){
                for (int i = 0; i < sIn.length(); i++) {
                    char c = sIn.charAt(i);
                    int num = c - 48;
                    String result = getRomanNumerals(num);
                    sb.append(result);
                }
                System.out.println(sb.toString());

            }

        }

    }

    public static String getRomanNumerals(int number){
        StringBuilder sb = new StringBuilder();
        String[] str = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅶ","Ⅷ","Ⅸ"};
        return str[number];
    }

    public static boolean legal(String str){
        if(str.length() > 9 ){
            System.out.println("超出输入长度！");
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c<'0' || c >'9'){
                System.out.println("输入不合法");
                return false;
            }
        }
        return true;
    }
}


