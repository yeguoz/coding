package com.test.demo3;

public class STest2 {
    public static void main(String[] args) {
        String a = "abcde";
        String b = "cdeab";

        boolean flag = check(a,b);
        System.out.println(flag);

    }

    public static boolean check(String str,String compare){

        for (int i = 0; i < str.length(); i++) {
            str = sT2(str);
            if (str.equals(compare)){
                return true;
            }

        }
        return false;
    }

    public static String sT2(String str) {
        char[] ch = str.toCharArray();
        char first = ch[0];
        //将第一个旋转到最后一位，然后拼接
        for (int i = 1; i < ch.length; i++) {
            ch[i-1] = ch[i];
        }
        ch[ch.length-1] = first;

        String result = new String(ch);
        return result;
    }

}
