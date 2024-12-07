package top.aidjajd.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<>();

        map.put("鲁迅","这句话是我说的");
        map.put("曹操","不可能绝对不可能");
        map.put("刘各","接着奏乐接着舞");
        map.put("柯镇恶","看我眼色行事");

        map.forEach( (k,v)-> System.out.println(k+"="+v) );

    }
}
