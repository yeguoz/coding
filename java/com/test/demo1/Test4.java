package com.test.demo1;

public class Test4 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[5];
        arr2 = arr;
        arr2[1] = 58;
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
