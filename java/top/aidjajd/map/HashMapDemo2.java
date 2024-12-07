package top.aidjajd.map;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {


        String[] s = {"A","B","C","D"};
        ArrayList<String> list = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 80; i++) {
           int index =  r.nextInt(s.length);
           list.add(s[index]);
        }

        HashMap<String,Integer> hm = new HashMap<>();
        Set<String> strings = hm.keySet();
        for (String str : list){
            if (hm.containsKey(str)){
                int count = hm.get(str);
                count++;
                hm.put(str,count);
            } else {
                hm.put(str,1);
            }
        }



        int max = 0 ;
        for (String k:strings){
            int count = hm.get(k);
            if (count > max){
                max = count;
            }
        }

        for (String k:strings){
            int count = hm.get(k);
            if (count == max){
                System.out.println(k);
            }
        }
        System.out.println("max = "+max);
    }
}
