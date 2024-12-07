package com.test.demo3;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        double[] arr1 = {1.0,2.0,3.0,4.0,5.0,6.0};
        String str = ArrayUtil.printArr(arr);
        System.out.println(str);
        double avg = ArrayUtil.getAerage(arr1);
        System.out.println();
        System.out.println(avg);

    }
}
