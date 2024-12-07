package com.test.demo3;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();

        Phone p1 = new Phone("小米",1000.0);
        Phone p2 = new Phone("苹果",8000.0);
        Phone p3 = new Phone("锤子",2999.0);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> result = getInfo(list,3000.0);

        for (int i = 0; i < result.size(); i++) {
            System.out.println("手机品牌："+result.get(i).getBrand());
            System.out.println("手机价格："+result.get(i).getPrice());
            System.out.println();
        }
    }

    public static ArrayList<Phone> getInfo(ArrayList<Phone> list,double price){
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000){
                result.add(list.get(i));
            }
        }
        return result;
    }
}
