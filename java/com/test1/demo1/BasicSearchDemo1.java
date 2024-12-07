package com.test1.demo1;

import java.util.ArrayList;

public class BasicSearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 81};
        ArrayList<Integer> result = basicSearch(arr,81);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public static ArrayList<Integer>  basicSearch(int[] arr, int num){
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                result.add(i);
            }
        }
        return result;
    }
}
