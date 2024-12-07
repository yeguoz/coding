package com.set;

import java.util.TreeSet;

public class TreeSetDemo3 {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((String o1, String o2)->{
                int i = o1.length() - o2.length();
                i = i==0?o1.compareTo(o2):i;
                return i;
            }
        );

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");
        ts.add("gf");


        System.out.println(ts);
    }
}
