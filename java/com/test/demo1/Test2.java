package com.test.demo1;

public class Test2 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,10};
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
            i++;
            j--;
        }
        for (int c = 0; c < arr.length; c++) {
            System.out.print(arr[c]+" ");
        }

    }

}
