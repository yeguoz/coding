package com.test.demo2;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] gf = new GirlFriend[4];
        GirlFriend gf1 = new GirlFriend("小诗",18,"女","唱歌");
        GirlFriend gf2 = new GirlFriend("小艾",19,"女","跳舞");
        GirlFriend gf3 = new GirlFriend("小舞",16,"女","弹琴");
        GirlFriend gf4 = new GirlFriend("小七",17,"女","写代码");
        gf[0] = gf1;
        gf[1] = gf2;
        gf[2] = gf3;
        gf[3] = gf4;
        int AgeSum = 0;
        int count = 0;
        for (int i = 0; i < gf.length; i++) {
            AgeSum += gf[i].getAge();
        }
        double avg = (AgeSum * 1.0)/gf.length;
        for (int i = 0; i < gf.length; i++) {
            if(gf[i].getAge() < avg ){
                count++;
                gf[i].info();
                System.out.println();
            }
        }
    }
}
