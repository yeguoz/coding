package com.test3.demo13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pc1 {
    public static void main(String[] args) {
        String str = "来黑马程序员学习Java," +
                "电话：18512516758,18512508907" +
                "或者联系邮箱：boniu@itcast.cn，" +
                "座机电话：01036517895,010-98951256"+
                "邮箱：bozai@itcast,cn," +
                "热线电话：400-618-9090,400-618-4000,4006184000,4006189090；";
        // 1[3-9]\\d{9}
        // \\w+@([a-z]+\\.){0,2}(com|cn)
        //0\\d{2}-?0\\d{7}
        // 0\\d{2}-?[1-9]\\d{2}-?[1-9]\\d{3}
        String regex = "(1[3-9]\\d{9})|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2})" +
                              " |(0\\d{2}-?[1-9]\\d{7})|([1-9]\\d{2}-?[1-9]\\d{2}-?[1-9]\\d{3})";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);

        while (m.find()) {
            String s = m.group();
            System.out.println(s);


        }


    }
}
