package com.test.demo2;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] c = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < c.length; i++) {
            c[i] = new Car();
            System.out.println("输入品牌：");
            String brand = sc.next();
            c[i].setBrand(brand);

            System.out.println("输入价格：");
            double price = sc.nextDouble();
            c[i].setPrice(price);

            System.out.println("输入颜色：");
            String color = sc.next();
            c[i].setColor(color);
            System.out.println();
        }
        for (int j = 0; j < c.length; j++) {
            System.out.println("品牌："+c[j].getBrand());
            System.out.println("价格："+c[j].getPrice());
            System.out.println("颜色："+c[j].getColor());
            System.out.println();

        }

    }
}
