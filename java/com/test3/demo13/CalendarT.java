package com.test3.demo13;

import java.util.Calendar;
import java.util.Date;

public class CalendarT {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = new Date(0L);
        c.setTime(d);
        c.set(2022,5,23);
        c.add(Calendar.MONTH,2);
        System.out.println(c);
        int year = c.get(Calendar.YEAR);
        int mouth = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);

        System.out.println(year+" "+mouth+" "+date);
    }
}
