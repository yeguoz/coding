package com.test3.demo12;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int num = sc.nextInt();
            boolean f = isPrime(num);
            System.out.println(f);
        }

    }
    public static boolean isPrime(int num){

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;

    }
}
