package com.test3.demo13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        String str = "2000-11-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        String s = sdf1.format(date);
        System.out.println(s);

    }
}
