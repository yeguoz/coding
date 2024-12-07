package com.test.demo1;

public class Test7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] result = copyOfRange(arr,0,8);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }

    public static int[] copyOfRange(int[] arr,int from,int to){
        int size = to - from;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {

            for (int j = from; j < to;j++){
                result[i] = arr[from];
                break;
            }
            from ++;
        }
        return result;

    }
}
