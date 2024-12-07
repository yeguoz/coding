package com.test3.demo12;

import java.math.BigDecimal;

public class BigDecimalT {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = BigDecimal.valueOf(0.29);
        BigDecimal bd3 = BigDecimal.valueOf(2);
        BigDecimal bd4 = BigDecimal.valueOf(2);
        System.out.println(bd1);
        System.out.println(bd2);
        System.out.println(bd3);
        System.out.println(bd3 == bd4);
    }
}
