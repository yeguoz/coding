package com.test1.demo1;

public class BasicSearchDemo {
    public static void main(String[] args) {
        int[] array = {131, 127, 147, 81, 103, 23, 7, 79};
        int result = basicSearch(array, 81);
        System.out.println(result);

    }

    public static int basicSearch(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i])
                return i;
        }
        return -1;
    }


}

