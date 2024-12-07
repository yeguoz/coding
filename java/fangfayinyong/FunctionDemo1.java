package fangfayinyong;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","里斯","王文武","炸熘","张三丰","张强");
/*
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张")&&s.length()==2;
            }
        }).forEach(name-> System.out.println(name));
*/

        list.stream().filter(new StringOperation()::stringFilter).forEach(name-> System.out.println(name));


    }
}
