package com.test.demo1;

public class UserTest {
    public static void main(String[] args) {
        User u = new User("张三", "123456",
                "aidjajd@163.com", "男", 18);
        System.out.println(u.getUsername());

    }
}
