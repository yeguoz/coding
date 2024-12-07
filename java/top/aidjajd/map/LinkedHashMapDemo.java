package top.aidjajd.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> lhm = new LinkedHashMap();

        lhm.put("b",456);
        lhm.put("a",123);
        lhm.put("a",55);
        lhm.put("c",789);
        System.out.println(lhm);
    }
}
