package com.linkSet;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<Ye> ye =  new ArrayList<>();
        ArrayList<Fu> fu =  new ArrayList<>();
        ArrayList<Zi> zi =  new ArrayList<>();

        ArrayList<Student> stu = new ArrayList<>();

        method(ye);
        method(fu);
        method(zi);


    }

    public static void method(ArrayList<? extends Ye> list){

    }
}

class Ye{}
class Fu extends Ye{}
class Zi extends Fu{}
class Student {}
