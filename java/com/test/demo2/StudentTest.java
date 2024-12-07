package com.test.demo2;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        // 1.定义长度为3的数组
        Student[] s = new Student[3];
        // 三个初始化数据
        Student s1 = new Student("01","王三",18);
        Student s2 = new Student("02","李维斯",17);
        Student s3 = new Student("heima002","张三",19);
        // 将三个数据先加入数组中
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        // 创建一个新对象
//        other.Student s4 = createObject(s);
        // 将新对象添加到数组中
//        s = addArr(s,s4);
        // 遍历打印
//        printArr(s);
        //根据id删除学生信息，
        //s = delete(s,"01");
        //遍历所有学生id；
        //printArr(s);

        search(s);
        printArr(s);
    }
    //查询id为“hiema002”学生，若存在则将年龄修改为年龄+1
    public static void search(Student[] s){

        for (int i = 0; i < s.length; i++) {
            Student stu = s[i];
            if(stu!=null){
                if(stu.getId()=="heima002"){
                    stu.setAge(stu.getAge()+1);
                }
            }
        }

    }

    //通过id删除学生信息，若存在则删除，不存在提示删除失败
    public static Student[] delete(Student[] s,String id){
        for (int i = 0; i < s.length; i++) {
            Student stu = s[i];
            if(stu.getId().equals(id)){
                stu.setId(null);
                stu.setName(null);
                stu.setAge(0);
                System.out.println("删除成功");
                return s;
            }
        }
        System.out.println("删除失败");
        return s;
    }

    // 将对象加入数组中
    public static Student[] addArr(Student[] s,Student stu){
        String flag = "empty";
        //判断原数组是否满
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i]!=null){
                count++;
            }
        }
        if(count == s.length){
            flag = "full";
        }
        //满的话，创建新数组数组长度为原数组+1
        if(flag == "full"){
            Student[] newS = new Student[s.length+1];
            for (int i = 0; i < s.length; i++) {
                newS[i] = s[i];
            }
            newS[newS.length-1] = stu;
            return newS;
        }
        //不满的话，在后面添加新对象到数组中并返回数组；
        s[count] = stu;
        return s;

    }

    //添加学生对象
    public static Student createObject(Student[] s){
        Student s_add = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入学号：");
        String id = sc.next();
        //判断学号是否重复，是则提示重新输入，否则记录信息最后，返回新的学生对象
        if(contains(s,id)){
            System.out.println("学号已存在，请重新输入");
            return null;
        }else {
            s_add.setId(id);

            System.out.println("输入姓名：");
            String name = sc.next();
            s_add.setName(name);

            System.out.println("输入年龄：");
            int age = sc.nextInt();
            s_add.setAge(age);


        }
        return s_add;
    }

    //判断id是否存在学生数组中,true的话就不添加，false添加
    public static boolean contains(Student[] s,String id){
        //数组中的stu的id与新添加的id比较
        for (int i = 0; i < s.length; i++) {
            Student stu = s[i];
            if(stu!=null){
                String sid = stu.getId();
                if(sid.equals(id)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void printArr(Student[] s){
        for (int i = 0; i < s.length; i++) {
            Student stu = s[i];
            if(stu!=null) {
                System.out.println("学号：" + stu.getId());
                System.out.println("姓名：" + stu.getName());
                System.out.println("年龄：" + stu.getAge());
                System.out.println();
            }
        }
    }


}
