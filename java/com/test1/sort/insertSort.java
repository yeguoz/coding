package com.test1.sort;

public class insertSort {
    public static void main(String[] args) {
        int[] arr = {3,44,38,5,47,15,36,26,27,2,49,4,19,50,48};
        int startIndex = getIndex(arr);
        if (startIndex == -1)
            return;
        insertSort(arr,startIndex);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    private static int getIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]){
                return i+1;
            }
        }
        return -1;
    }

    public static void insertSort(int[] arr,int startIndex){
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j>0) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    j--;
                }else break;
            }
        }
    }
}
