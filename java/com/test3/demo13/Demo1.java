package com.test3.demo13;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("输入一个1-100整数");
            String strNum = sc.nextLine();
            int num = Integer.parseInt(strNum);
            if (num < 1 || num > 100){
                System.out.println("重新输入");
                continue;
            }
            list.add(num);
            int sum = getSum(list);
            if (sum > 200){
                System.out.println("已满足条件");
                break;
            }
        }
    }

    public static int getSum(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
