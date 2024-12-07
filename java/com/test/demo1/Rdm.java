package com.test.demo1;

import java.util.Random;

public class Rdm {
    public static void main(String[] args) {
        char[] ch = new char[52];
        String result  = "";
        for (int i = 0; i < ch.length; i++) {
            if(i<26){
                ch[i] = (char)(97+i);
            }else {
                ch[i] = (char)(65+(i-26));
            }
        }
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int indexRandom = r.nextInt(52);
            result += ch[indexRandom];
        }
        int num = r.nextInt(10);
        result += num;
        System.out.println(result);


    }
}
