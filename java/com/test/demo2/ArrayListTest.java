package com.test.demo2;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        list.add("abc");
        list.add("xxx");
        list.add("iii");
        list.add("vvv");

        String str = list.remove(0);
        System.out.println(str);

        String str1 =list.set(0,"测试");
        System.out.println(str1);

        String str2 = list.get(0);
        System.out.println(str2);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println(list);

    }
}
