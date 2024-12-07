package com.test.demo3;

import java.util.StringJoiner;

public class Nu2 {
    //给字符串s返回最后一个单词长度
    public static void main(String[] args) {
        String s = "hello worl";
        int len = getLen(s);
        System.out.println(len);
    }
    public static int getLen(String str){
        StringJoiner sj  = new StringJoiner(" ");
        sj.add(str);
        String result = sj.toString();
        int count = 0;
        for (int i = result.length()-1; i >= 0; i--) {
            char c = result.charAt(i);
            if(c != ' '){
                count++;
            }else {
                return count;
            }
        }
        return -1;
    }
}
