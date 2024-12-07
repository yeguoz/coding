package com.test3.demo13;

import java.util.Arrays;

public class DEmo {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        Arrays.sort(arr,(Integer o1,Integer o2)->o2-o1);

        String[] str = {"a","aa","aaa","aaaa"};
        Arrays.sort(str,(str1,str2)->str2.length() - str1.length());

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));
    }
}
