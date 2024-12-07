package com.test.demo1;

import java.util.Random;

public class RandomC1 {
    public static void main(String[] args) {
        int [] arr = {2,588,888,1000,10000};
        int[] result = getNewArr(arr);
        for (int i : result) {
            System.out.println(i);
        }
    }
    public static int[] getNewArr(int[] arr){
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);

            int temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = temp;
            System.out.println("i:"+i+" randomIndex "+randomIndex);

        }

        return arr;
    }
}
