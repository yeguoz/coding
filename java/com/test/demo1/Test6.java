package com.test.demo1;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,8,9};
        boolean number = getNumber(arr,8);
        System.out.println(number);
    }

    public static boolean getNumber(int[] arr,int x){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                return true;
            }
        }
        return false;
    }
}
