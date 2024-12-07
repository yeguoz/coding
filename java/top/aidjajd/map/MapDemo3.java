package top.aidjajd.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("标枪选手","马超");
        map.put("人物挂件","明世隐");
        map.put("御龙骑士","一直平");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println("--------增强for---------------");
        for (Map.Entry<String, String> entry : entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" = "+value);
        }

        System.out.println("--------Iterator---------------");
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> kv = it.next();
            System.out.println(kv.getKey()+"***"+kv.getValue());
        }

        System.out.println("--------forEach---------------");
        entries.forEach( entry-> System.out.println(entry.getKey()+"----"+entry.getValue()));

    }
}
