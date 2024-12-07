package com.test3.demo7;

public interface English {

    public abstract void speakEnglish();

    public default void show(){
        System.out.println("接口中默认方法");
    }
}
