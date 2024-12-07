package com.test.demo1;

public class CP {
    public static void main(String[] args) {
        int[][] arr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int yearSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = getSum(arr[i]);
            yearSum += sum;
        }
        System.out.println(yearSum);
    }
    public static int getSum(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}
