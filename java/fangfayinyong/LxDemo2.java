package fangfayinyong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class LxDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Collections.addAll(list,new Student("张三",23),new Student("罗明远",21),
                new Student("朱瑾春",24), new Student("贺天赫",26),
                new Student("唐瑾春",19));
        String[] array = list.stream().map(Student::getName).toArray(String[]::new);

        System.out.println(Arrays.toString(array));
    }
    public String apply(Student stu){
        return stu.getName();
    }
}
