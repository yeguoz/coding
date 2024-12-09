package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class LxDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"zhagnsan,23","lisi,24","wangwu,25");

        Map<String, Integer> map = list.stream().filter(name -> Integer.parseInt(name.split(",")[1]) >= 24)
                .collect(Collectors.toMap(name -> name.split(",")[0],
                        name -> Integer.parseInt(name.split(",")[1])));

        System.out.println(map);

    }
}
