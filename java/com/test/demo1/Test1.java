package com.test.demo1;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int n = r.nextInt(91)+10;
            arr[i] = n;
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("和为："+sum);
        int avg = sum/arr.length;
        System.out.println("平均值："+avg);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<avg){
                count++;
            }
        }
        System.out.println("小于平均值的为："+count);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
