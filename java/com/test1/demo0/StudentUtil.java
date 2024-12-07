package com.test1.demo0;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){

    }

    public static int getMaxAge(ArrayList<Student> stu){
        int max = stu.get(0).getAge();
        for (int i = 1; i < stu.size(); i++) {
            int tmpAge = stu.get(i).getAge();
            if(tmpAge > max){
                max = tmpAge;
            }
        }
        return max;
    }
}
