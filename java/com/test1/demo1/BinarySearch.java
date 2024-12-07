package com.test1.demo1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {7,23,79,81,103,127,131,147};
        int result = binarySearch(arr,150);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr,int item){
        int min = 0;
        int max = arr.length-1;
        while (min<=max){
            int mid = (min + max)/2;
            if (arr[mid]==item)
                return mid;
            if (item<arr[mid])
                max = mid-1;
            if (item>arr[mid])
                min = mid+1;
        }
        return -1;
    }
}
