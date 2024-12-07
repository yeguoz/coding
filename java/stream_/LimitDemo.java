package stream_;

import java.util.ArrayList;
import java.util.Collections;

public class LimitDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","里斯","王文武","炸熘","张三丰","张强");
//        list.stream()
//                .limit(3)
//                .forEach(s-> System.out.println(s));

//        list.stream()
//                .skip(2)
//                .forEach(name-> System.out.println(name));

        list.stream().skip(2)
                .limit(3)
                .forEach(name-> System.out.println(name));

    }
}
