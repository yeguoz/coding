package com.test.demo2;

import java.util.Scanner;

public class StringTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c>= 65 && c<=90){
                //大写
                count1++;
            }else if (c>=97 && c<=122){
                //小写
                count2++;
            }else if (c>=48 && c<=57){
                //数字
                count3++;
            }
        }
        System.out.println("大写字母数量："+count1);
        System.out.println("小写字母数量："+count2);
        System.out.println("数字数量："+count3);

    }
}
