package com.test.demo2;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("测试1");
        list.add("测试2");
        list.add("测试3");
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i)+", ");
            }
        }
        System.out.println("]");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.print("[");
        for (int i = 0; i < list1.size(); i++) {
            if(i == list1.size()-1){
                System.out.print(list1.get(i));
            }else {
                System.out.print(list1.get(i)+", ");
            }
        }
        System.out.print("]");

    }
}
