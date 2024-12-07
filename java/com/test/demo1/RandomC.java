package com.test.demo1;

import java.util.Random;

public class RandomC {
    public static void main(String[] args) {
        int[] arr = {2,588,888,1000,10000};

        int[] result = getNewArr(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
    public static int[] getNewArr(int[] arr){
        Random r = new Random();
        int[] result = new int[arr.length];
        //随机下标将不存在原数组中的奖金存入新数组中
        for (int i = 0; i < arr.length;) {
            //flag=0时不存在于新数组中
            int flag = 0;
            int indexRandom = r.nextInt(arr.length);
            //遍历原数组判断元素是否在新数组中，如果在flag置为1
            for (int j = 0; j < arr.length; j++) {
                if(arr[indexRandom] == result[j]){
                    flag = 1;
                }
            }
            if(flag == 0){
                result[i] = arr[indexRandom];
                i++;
            }
        }
        return result;
    }
}
