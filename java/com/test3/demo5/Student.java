package com.test3.demo5;

public class Student {
    private String id;
    private String name;
    {//构造代码块，构造方法执行前执行
        System.out.println("开始创建对象了");
    }

    public Student() {

    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
