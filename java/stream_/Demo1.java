package stream_;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","张无忌","张三丰","周弱智","占强");

        list.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
    }
}
