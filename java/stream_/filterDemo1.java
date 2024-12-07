package stream_;

import java.util.ArrayList;
import java.util.Collections;

public class filterDemo1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","里斯","王文武","炸熘","张三丰","张强");

//        Stream<String> stream1 = list.stream();
//        Stream<String> stream2 = stream1.filter(name -> name.startsWith("张"));
//        stream2.forEach(name-> System.out.println(name));
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));

    }
}
