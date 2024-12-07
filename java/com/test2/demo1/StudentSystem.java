package com.test2.demo1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:while (true) {
            System.out.println("--------黑马程序员学生管理系统-------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    updateStudent(list);
                    break;
                case "4":
                   queryStudent(list);
                    break;
                case "5":
                    System.out.println("退出");
                    break loop;
                default:break loop;
            }
        }


    }

    //添加学生
    public static void addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);

        String id = null;
        while (true) {
            System.out.println("请输入学生id：");
            id = sc.next();
            boolean flag = contains(list,id);
            if (flag){
                //id已存在，重新输入
                System.out.println("id已存在，请重新输入");
            }else {
                //id不存在
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.next();

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();

        System.out.println("请输入学生住址：");
        String address = sc.next();
        Student s = new Student(id,name,age,address);

        list.add(s);
        System.out.println("添加成功");

    }

    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int index = getIndex(list,id);
        if(index >= 0){
            list.remove(list.get(index));
            System.out.println("删除成功");
        }else {
            System.out.println("没有这个学生，删除失败");
        }
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        while (true) {
            String id = sc.next();
            int index = getIndex(list,id);
            if(index >= 0){
                Student stu = list.get(index);

                System.out.println("请输入要修改学生姓名：");
                String newName = sc.next();
                stu.setName(newName);

                System.out.println("请输入要修改学生年龄：");
                int newAge = sc.nextInt();
                stu.setAge(newAge);

                System.out.println("请输入要修改学生住址：");
                String newAddress = sc.next();
                stu.setAddress(newAddress);
                System.out.println("修改成功");
                break;
            }else {
                System.out.println("没有该学生,请重新输入");
            }

       }
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> list){
        if(list.size() == 0){
            System.out.println("当前没有学生");
            return;
        }
        System.out.println("id"+"\t\t"+"姓名"+"\t"+"年龄"+"\t"+"家庭住址");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId()+"\t"+list.get(i).getName()+"\t"+
                    list.get(i).getAge()+"\t"+list.get(i).getAddress());
        }
    }

    //查询id是否存在于集合中
    public static boolean contains(ArrayList<Student> list,String id){
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i).getId().equals(id)){
//                //id已存在
//                return true;
//            }
//        }
//        return false;
        return getIndex(list,id)>=0;
    }

    //查询id是否在集合中在的返回下标，不在返回-1
    public static int getIndex(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sId = stu.getId();
            if(sId.equals(id)){
                return i ;
            }
        }
        return -1;

    }
}
