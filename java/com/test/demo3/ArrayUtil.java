package com.test.demo3;

public class ArrayUtil {

    private ArrayUtil() {
    }

    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
               sb.append(arr[i]);
            }else {
               sb.append(arr[i]+", ");
            }

        }
        sb.append("]");
        return sb.toString();
    }
    public static double getAerage(double[] d){
        double sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum = sum + d[i];
        }
        double avg = sum / d.length;
        return avg;
    }

}
