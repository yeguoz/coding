package com.test.demo1;

public class Test5 {
    public static void main(String[] args) {
       boolean result = getBl(getArea(10,50),getArea(52,20));
        System.out.println(result);
    }
    public static int getArea(int len,int weight){
        int result = (len+weight)*2;
        return result;
    }

    public static boolean getBl(int x,int y){
        boolean result = false;
        if(x>y)
            result = true;
        return result;
    }
}
