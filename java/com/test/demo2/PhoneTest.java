package com.test.demo2;

public class PhoneTest {
    public static void main(String[] args) {
        Car c1 = new Car("大众",1999,"红色");
        Car c2 = new Car("奥迪",4999,"白色");
        Car c3 = new Car("五菱宏光",3999,"银色");
        Car[] c = {c1,c2,c3};
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += c[i].getPrice();
        }
        System.out.println("平均价格为："+sum*1.0/c.length);

    }
}
