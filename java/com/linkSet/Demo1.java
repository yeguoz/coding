package com.linkSet;

public class Demo1 {
    public static void main(String[] args) {
        MyArrayList<String> ml = new MyArrayList<>();
        boolean b = ml.add("123");
        String str2 = ml.getData(0);
        System.out.println(b);
        System.out.println(str2);

        System.out.println(ml);

    }
}
