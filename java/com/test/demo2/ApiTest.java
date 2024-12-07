package com.test.demo2;

public class ApiTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("aBc");

        char[] ch = {'a', 'v', 'x'};
        String s3 = new String(ch);

        byte[] bytes = {97, 65, 98};
        String s4 = new String(bytes);

        boolean a = s1.equals(s2);
        System.out.println(a);

        boolean b = s1.equalsIgnoreCase(s2);
        System.out.println(b);
    }
}
