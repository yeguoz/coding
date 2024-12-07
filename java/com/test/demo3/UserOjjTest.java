package com.test.demo3;

import java.util.ArrayList;

public class UserOjjTest {
    public static void main(String[] args) {
        ArrayList<UserOj> list = new ArrayList<>();

        UserOj u1 = new UserOj("001","aid","123456");
        UserOj u2 = new UserOj("002","aidj","789456");
        UserOj u3 = new UserOj("003","aidja","asdff");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        int index = getIndex(list,"002");
        System.out.println(index);


    }
    public static int getIndex(ArrayList<UserOj> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
