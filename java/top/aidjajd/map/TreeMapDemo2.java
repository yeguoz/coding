package top.aidjajd.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        String str = "aababcabcdabcde";
        TreeMap<Character,Integer> tm = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
           char c = str.charAt(i);
           if (tm.containsKey(c)){
               int v = tm.get(c);
               v++;
               tm.put(c,v);
           }else {
               tm.put(c,1);
           }
        }
        Set<Map.Entry<Character, Integer>> entries = tm.entrySet();
        for (Map.Entry<Character, Integer> entry: entries){
            System.out.printf("%c(%d) ",entry.getKey(),entry.getValue());
        }
    }
}
