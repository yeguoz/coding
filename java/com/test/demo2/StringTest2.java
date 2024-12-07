package com.test.demo2;

public class StringTest2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String str = arrTOString(arr);
        System.out.println(str);
    }

    public static String arrTOString(int[] arr){
        if(arr == null) {
            return "";
        }
        if(arr.length == 0){
            return "[]";
        }

        String result = "[";

        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                result = result + arr[i];
            }else {
                result = result + arr[i] + ',';
            }
        }
        result = result +']';
        return result;

        }


}

