package fangfayinyong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LxDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"张三,23","罗明远,21","朱瑾春,24",
                "贺天赫,26","唐瑾春,19");

        Student[] array = list.stream().map(LxDemo1::apply).toArray(Student[]::new);

        System.out.println(Arrays.toString(array));
    }


    public static Student apply(String s){
        return new Student(s.split(",")[0],
                Integer.parseInt(s.split(",")[1]));
    }
}
