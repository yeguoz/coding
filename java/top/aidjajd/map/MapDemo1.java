package top.aidjajd.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();

        m.put("郭靖","黄蓉");
        m.put("韦小宝","木健平");
        System.out.println(m.put("一直平", "兄龙女"));
        System.out.println(m);
        String str1 = m.remove("韦小宝");
        System.out.println(str1);
        System.out.println(m.containsKey("一直平"));
//        m.clear();
//        System.out.println(m.isEmpty());
        System.out.println(m.size());
        System.out.println(m.containsValue("兄龙女"));
    }

}
