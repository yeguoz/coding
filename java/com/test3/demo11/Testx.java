package com.test3.demo11;

public class Testx {
    public static void main(String[] args) {
        int js = 1095;
        int sum = 0;
        int count = 1;
        while (js > 1){
            sum = sum + count;
            count++;
            js--;
        }
        System.out.println(sum);
    }
}
