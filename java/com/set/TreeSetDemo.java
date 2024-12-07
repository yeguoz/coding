package com.set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);

//        Iterator<Integer> it = ts.iterator();
//        while (it.hasNext()){
//            int i = it.next();
//            System.out.println(i);
//        }

//        for (int i : ts){
//            System.out.println(i);
//        }

        ts.forEach( i-> {
            System.out.println(i);
        });
    }
}
