package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class forEachCountTOArrayDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","里斯","王文武","炸熘","张三丰","张强","张强");

        long count = list.stream().count();

//        Object[] array = list.stream().toArray();
//        System.out.println(Arrays.toString(array));
      /*  String[] array = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {

                return new String[value];
            }
        });
        System.out.println(Arrays.toString(array));*/

        String[] array = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array));
    }
}
