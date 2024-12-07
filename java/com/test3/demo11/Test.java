package com.test3.demo11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*■题目描述
        给定长度为n的升序数组，顺时针旋转数组，[a[0],a[1],a[2]...,a[n-1]]旋转2次的结果
        为数组[a[n-2],a[n-1],a[0].…a[n-3]],请找出旋转多次后数组中的最大元素，需要考
        虑存在重复元素的情况。要求时间复杂度为O(logN)

        输入描述：
        第一行输入整数N,代表数组的长度
        第二行输入N个整数，代表N个数组元素
        输出描述：
        输出数组中最大的元素

        示例1输入输出示例仅供调试，后台判题数据一般不包含示例

        输入
        2
        1 2 0 1
        输出
        2 */

        Scanner sc = new Scanner(System.in);
        System.out.print("输入数组大小：");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("输入数组arr["+i+"]的值：");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("最大值为："+max);
    }
}
