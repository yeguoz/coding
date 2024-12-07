package com.test3.demo13;

import java.util.Date;
import java.util.Random;

public class DateTest {
    public static void main(String[] args) {
        Random  r = new Random();
        long time1 = method(r);
        long time2 = method(r);
        if (time1 > time2){
            System.out.println("time1在time2之后");
        }else if(time2 > time1){
            System.out.println("time2在time1之后");
        }


    }
    public static long method(Random r){
        Date d = new Date(r.nextInt());

        return d.getTime();

    }




}

