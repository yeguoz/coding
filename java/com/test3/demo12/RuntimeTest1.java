package com.test3.demo12;

import java.io.IOException;

public class RuntimeTest1 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println(r.availableProcessors());

        System.out.println(r.maxMemory()/ 1024/1024+"M");

        System.out.println(r.totalMemory()/ 1024/1024+"M");

        System.out.println(r.freeMemory()/ 1024/1024+"M");

        try {
            r.exec("shutdown -a");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
