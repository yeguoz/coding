package top.aidjajd.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("lisi",21);
        Student s3 = new Student("zhoaliu",20);
        Student s4 = new Student("zhoaliu",20);

        HashMap<Student,String> map = new HashMap<>();

        map.put(s1,"北京");
        map.put(s2,"上海");
        map.put(s3,"包头");
        map.put(s4,"内蒙");

        Set<Map.Entry<Student, String>> entries = map.entrySet();

        for (Map.Entry<Student,String> entry:entries){
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }

        Set<Student> students = map.keySet();
        for (Student stu:students){
            System.out.println(stu+" -- "+map.get(stu));
        }
        System.out.println("---------forEach----------------");
        map.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student stu, String s) {
                System.out.println(stu+" * "+s);
            }
        });

    }
}
