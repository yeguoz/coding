package com.test3.demo13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pc {
    public static void main(String[] args) {
        String s = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11,因为这两个是长" +
                "期支持版本，下一个长期支持版本是ava17,相信在未来不久Java17也会逐渐登上历史舞台";
        Pattern p = Pattern.compile("Java\\d*");
        Matcher m = p.matcher(s);

        while (m.find()){
            String  s1 = m.group();
            System.out.println(s1);
        }


    }
}
