package stream_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class MapDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三-16","里斯-19","王五-18","赵六-45");

        list.stream().map(new Function<String, Object>() {
            @Override
            public Integer apply(String s){
                String[] split = s.split("-");
                String s1 = split[1];
                int i = Integer.parseInt(s1);
                return i;
            }
        }).forEach(i-> System.out.println(i));
        System.out.println("========================================");
        list.stream().map(s->Integer.parseInt(s.split("-")[1]))
                .forEach(num-> System.out.println(num));
    }
}
