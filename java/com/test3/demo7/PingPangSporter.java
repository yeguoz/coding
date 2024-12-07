package com.test3.demo7;

public class PingPangSporter extends Sporter implements English{
    public PingPangSporter() {
    }

    public PingPangSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study(){
        System.out.println("学乒乓球");
    }

    @Override
    public void speakEnglish(){
        System.out.println("学员说英语");
    }

}
