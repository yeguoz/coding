package com.test.demo1;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int index = 0;
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            arr[index] = i;
            index++;
        }
        int[] result = getZS(arr);
        for (int i = 0; i < result.length; i++) {
            if(result[i] !=0 ) {
                System.out.println(result[i]);
                count++;
            }
        }
        System.out.println(count);

    }
    public static int[] getZS(int[] arr){
        int[] result = new int[100];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int flag = 1;
            for (int j =2;j<=Math.sqrt(arr[i]);j++){
                if(arr[i] % j == 0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}
