package com.test.demo2;

import java.util.Scanner;

public class StringT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        String result = change(money);
        System.out.println(result);
    }

    public static String change(int money){
        String[] chars = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        String[] chars1 = {"佰","拾","万","仟","佰","拾","元"};
        String temp = "";
        String result = "";
        int count = 0;
        while (money > 0){
            //计算money位数
            count++;
            int ge = money % 10;
            money /= 10;
            temp = chars[ge] + temp;

        }
        //共七位数，在缺的前面补零
        for (int i = 0; i < 7-count; i++) {
            temp = chars[0] + temp;
        }
        //在每一位后面加上单位
        for (int i = 0; i < 7; i++) {
            result = result + temp.charAt(i) + chars1[i];
        }

        return result;

    }
}
