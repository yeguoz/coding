package com.test1.sort;

public class BubbleDemo {
    public static void main(String[] args) {
        int[] arr = {2,4,5,3,1};
        bubbleSort(arr);
        for (int j : arr) {
            System.out.print(j);
        }


    }
    
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

    }
}
