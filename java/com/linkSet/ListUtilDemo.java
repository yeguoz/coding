package com.linkSet;

import java.util.ArrayList;
import java.util.Iterator;

public class ListUtilDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        ListUtil.addAll(list,"adv","adf");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }



    }
}
