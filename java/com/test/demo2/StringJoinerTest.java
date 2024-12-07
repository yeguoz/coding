package com.test.demo2;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner(",","[","]");

        sj.add("abc").add("def").add("hij");
        String str = sj.toString();
        System.out.println(str);

    }
}

