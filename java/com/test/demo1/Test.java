package com.test.demo1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        boolean flag = true;
        while (true) {
            int x = sc.nextInt();
            if(x == 1|| x<0){
                System.out.println("请输入有效的数字");
                continue;
            }
            for (i = 2; i < x; i++) {
                if (x % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(x + "是质数");
            } else {
                System.out.println(x + "不是质数");
            }

        }
    }
}
