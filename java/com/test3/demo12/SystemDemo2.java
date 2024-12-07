package com.test3.demo12;

public class SystemDemo2 {
    public static void main(String[] args) {
       double start = System.currentTimeMillis();
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        System.arraycopy(arr1,0,arr2,4,3);
        System.arraycopy(arr1,6,arr3,2,3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        double end = System.currentTimeMillis();
        System.out.println();
        System.out.println(end - start);
    }
}
