package com.test3.demo13;

public class Demo3 {
    public static void main(String[] args) {

        String str = toBinaryString(123);
        System.out.println(str);
        System.out.println(Integer.toBinaryString(123));

    }

    public static String toBinaryString(int num){

        return getNum(num);
    }

    public static String getNum(int num){
        String str = "";
        int yu = num % 2;
        num = num / 2;
        str = String.valueOf(yu);
        if (num == 0){
            return str;
        }
        if (num != 0)
           return getNum(num) + str;

        return null;
    }


}
