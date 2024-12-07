package com.test1.demo0;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("zhangsan",19,"男");
        Student stu2 = new Student("lisi",20,"男");
        Student stu3 = new Student("wangwu",22,"女");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int ageMax = StudentUtil.getMaxAge(list);
        System.out.println(ageMax);


    }

}
