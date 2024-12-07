package com.test1.arrays;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        System.out.println("-----------toString------------");
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------binarySearch-------------");
        System.out.println(Arrays.binarySearch(arr, 8));
        System.out.println("--------------------copyOf---------------");
        int[] newArr = Arrays.copyOf(arr,11);
        System.out.println(Arrays.toString(newArr));

        System.out.println("---------------copyOfRange---------------");
        int[] newArr2 = Arrays.copyOfRange(arr,0,9);
        System.out.println(Arrays.toString(newArr2));

        System.out.println("---------------fill-------------");
        Arrays.fill(arr,0);
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------sort------------------");
        int[] arr2 = {10,11,3,5,6,1,7,8,4,9};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
