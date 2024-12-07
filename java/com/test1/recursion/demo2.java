package com.test1.recursion;

public class demo2 {
    public static void main(String[] args) {
        int result = getSum(4);
        System.out.println(result);
    }
    private static int getSum(int sum) {
        if (sum == 1)
            return 1;
        return sum * getSum(sum-1);
    }
}
