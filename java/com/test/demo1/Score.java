package com.test.demo1;

import java.util.Random;

public class Score {
    public static void main(String[] args) {
        int[] arr = getScore();
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.print(arr[i]+" ");
        }
        sum -= (max+min);
        avg = sum / 4.0;
        System.out.println("总分："+sum+" 平均分："+avg);
    }
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int[] getScore(){
        Random r = new Random();
        int[] result = new int[6];
        for (int i = 0; i < 6; i++) {
            int score = r.nextInt(101);
            result[i] = score;
        }
        return result;
    }
}
