package com.test.demo1;

import java.util.Scanner;

public class fjp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入原价：");
        double price = sc.nextInt();
        System.out.print("输入月份：");
        int month = sc.nextInt();
        System.out.print("头等舱y，经济舱n：");
        char flag = sc.next().charAt(0);
        price = getPrice(price,month,flag);
        System.out.println(price);
    }
    public static double getPrice(double price,int month,char flag){
            if (month >= 5 && month <= 10 && flag =='y'){
                price *= 0.9;
            }else if(month >= 5 && month <= 10 && flag =='n'){
                price *= 0.85;
            }else if((month >= 1 && month <= 4) || (month >= 11 && month <= 12) && flag =='y'){
                price *= 0.7;
            }else if((month >= 1 && month <= 4) || (month >= 11 && month <= 12) && flag =='n'){
                price *= 0.65;
            }else {
                System.out.println("输入不合法");
            }
            return price;
        }

}
