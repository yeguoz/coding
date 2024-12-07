package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setDemo1 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("张三");
        s.add("李四");
        s.add("王五");

        System.out.println(s);

        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.print(str+" ");
        }

        for (String str: s){
            System.out.print(str+" ");
        }
        System.out.println();
        s.forEach( str -> System.out.printf("forEach_str = %s",str+" "));
    }
}
