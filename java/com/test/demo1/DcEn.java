package com.test.demo1;

public class DcEn {
    public static void main(String[] args) {
        int m = getDcEn(8887);
        System.out.println(m);
    }
    public static int getDcEn(int sum){
        //sum为加密后的密文，m是明文
        int m = 0;
        while (sum != 0) { // x = 15 , x=1   0
            //提取个位的数字
            int gw = sum % 10; //gw=5,gw =1
            //删去sum被提走的数字
            sum = (sum - gw) / 10;// x=1,x=0
            //加密规则+5并与10取余
            gw = (gw + 5) % 10;//gw = 0,gw=6   5
            //反转加密后的内容
            m = m * 10 + gw; //sum = 0, 6, 8346
        }
        return m;
    }

}


