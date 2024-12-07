package fangfayinyong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,4,5,6,7,8,9);

       /* Integer[] array = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(array));*/
        Integer[] array = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));

    }
}
