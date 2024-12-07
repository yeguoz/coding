package top.aidjajd.map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",19);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("jsp",16);
        Student s5 = new Student("zhaoliu",27);
        Student s6 = new Student("zhaoliu",27);
        Student s7 = new Student("a",27);

        TreeMap<Integer,String> tm1 = new TreeMap<>((o1,o2)->o2-o1 );
        TreeMap<Student,String> tm2 = new TreeMap<>();
        tm1.put(2,"w");
        tm1.put(8,"f");
        tm1.put(4,"q");
        tm1.put(9,"p");
        tm1.put(1,"c");
        tm1.put(5,"o");


        tm2.put(s1,"河南");
        tm2.put(s2,"北京");
        tm2.put(s3,"内蒙");
        tm2.put(s4,"广东");
        tm2.put(s5,"海南");
        tm2.put(s6,"上海");
        tm2.put(s7,"南京");
        Set<Student> students = tm2.keySet();
        for (Student stu :students)      {
            System.out.println(stu+"--"+tm2.get(stu));
        }

    }

}
