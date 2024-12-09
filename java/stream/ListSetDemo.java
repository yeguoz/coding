package stream;

import java.util.ArrayList;
import java.util.Collections;

public class ListSetDemo {
    public static void main(String[] args) {

        // 单列集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d");
//        // Stream流
//        Stream<String> stream = list.stream();
//        stream.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//
        list.stream().forEach(s-> System.out.println(s));

    }
}
