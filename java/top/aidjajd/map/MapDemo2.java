package top.aidjajd.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("一直皮","小龙女");
        map.put("郭靖","穆念慈");
        map.put("欧阳克","黄蓉");

        Set<String> keys = map.keySet();
        System.out.println("----------增强for-----------------");
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("----------Iterator-----------------");
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            String value = map.get(key);
            System.out.println(key+" = "+value);
        }
        System.out.println("----------forEach-----------------");
        keys.forEach( key->System.out.println(key+" = "+map.get(key)));
    }
}
