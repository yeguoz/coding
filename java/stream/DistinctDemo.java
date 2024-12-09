package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class DistinctDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","里斯","王文武","炸熘","张三丰","张强","张强");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"a");
       /* list.stream().distinct()
                .forEach(name-> System.out.println(name));*/

        Stream.concat(list.stream(),list2.stream()).forEach(name-> System.out.println(name));
    }
}
