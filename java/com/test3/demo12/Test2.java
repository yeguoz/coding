package com.test3.demo12;

public class Test2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10000; i < 99999; i++) {
            double sum = 0;
            int temp = i;
            while (temp > 0){
                int ge = temp % 10 ;
                temp = temp / 10 ;
                sum = sum + Math.pow(ge,5);
            }
            if(sum == i){
                count++;
            }
        }
        System.out.println(count);
    }
}
