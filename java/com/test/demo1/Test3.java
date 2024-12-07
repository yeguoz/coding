package com.test.demo1;

import java.util.Random;

public class Test3 {
    public static void main(String[] args){
        Random r = new Random();
        int[] arr = {1,2,3,4,5};

        //{3,2,1,4,5} {3,1,2,4,5} {3,1,2,4,5} {3,1,4,2,5} {3,1,5,2,4}
        for (int i = 0; i < arr.length; i++) {
            int number = r.nextInt(arr.length);
            int tmp = arr[i];
            arr[i] = arr[number];
            arr[number] = tmp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
