package com.test3.demo12;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerT {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("10");
        BigInteger bi2 = new BigInteger("100",2);
        BigInteger bi3 = new BigInteger(10,new Random());
        BigInteger bi4 = BigInteger.valueOf(15);
        // +
        BigInteger bi5 =  bi1.add(bi4);
        System.out.println(bi5);
        // -
        BigInteger bi6 = bi1.subtract(bi4);
        System.out.println(bi6);
        // *
        BigInteger bi7 = bi1.multiply(bi4);
        System.out.println(bi7);
        // /
        BigInteger bi8 = bi4.divide(bi1);
        System.out.println(bi8);
        // / and yu
        BigInteger[] bi9 = bi4.divideAndRemainder(bi1);
        System.out.println(bi9[0]+" "+bi9[1]);

        // equals
        boolean bi0 = bi1.equals(bi4);
        System.out.println(bi0);

        // cimi
        BigInteger bi10 = bi1.pow(2);
        System.out.println(bi10);

        //max
        BigInteger bi11 = bi1.max(bi4);
        System.out.println(bi11);

        int num = bi1.intValue();
        System.out.println(num);

    }
}
