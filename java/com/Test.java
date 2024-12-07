package com;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] number = {0,1,2,3,4,5,6,7,8};
        int[][] num =  new int[3][3];
        Random r = new Random();
        for (int i = 0; i < number.length; i++) {
            int index = r.nextInt(number.length);
            int temp = number[index];
            number[index] = number[i];
            number[i] = temp;
        }

        for (int i = 0; i < number.length; i++) {
            num[i / 3][i % 3] = number[i];
        }

    }
}
