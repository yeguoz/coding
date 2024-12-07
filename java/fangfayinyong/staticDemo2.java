package fangfayinyong;

import java.util.ArrayList;
import java.util.Collections;

public class staticDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5","6","7");

//        list.stream()
//                .map(new Function<String, Integer>() {
//                    @Override
//                    public Integer apply(String s) {
//                        int i = Integer.parseInt(s);
//                        return i;
//                    }
//                }).forEach(i-> System.out.println(i));


        list.stream()
                .map(Integer::parseInt).forEach(i-> System.out.println(i));

    }
}
