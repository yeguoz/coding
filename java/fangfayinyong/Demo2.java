package fangfayinyong;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","dddd");

       /* list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {

                return  s.toUpperCase();
            }
        }).forEach(s-> System.out.println(s));
*/
        list.stream().map(String::toUpperCase).forEach(s-> System.out.println(s));

    }
}
