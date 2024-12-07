package com.test.demo3;

public class STest1 {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "cdeal";

        System.out.println(sT1(a,b));


    }

    public static boolean sT1(String str1,String str2){
        String result = str1;
        for (int i = 0; i < result.length(); i++) {
            String first = result.substring(0,1); //'bcdea'
            String end = result.substring(1); //'a'
            result = end+first;
            if(result.equals(str2)){
                return true;
            }
        }
        return false;
    }


}














