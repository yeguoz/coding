package stream_;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("aaa",111);
        hm.put("bbb",222);
        hm.put("vvv",333);
        hm.put("ddd",444);

        hm.keySet().stream().forEach(key-> System.out.println(key));

        hm.entrySet().stream().forEach(entry-> System.out.println(entry));
    }
}
