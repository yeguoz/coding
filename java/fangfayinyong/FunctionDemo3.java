package fangfayinyong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"杨冰枫,15","朱冰枫,16","李苒溪,19","韦佳玉,20",
                "酆佳琪,21","苗诗悦,22");
       /* List<other.Student> cList = list.stream().map(new Function<String, other.Student>() {

            @Override
            public other.Student apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new other.Student(name, age);
            }
        }).collect(Collectors.toList());
        System.out.println(cList);*/

        List<Student> list1 = list.stream().map(Student::new).collect(Collectors.toList());

        System.out.println(list1);


    }
}
