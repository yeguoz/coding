package thread.demo1;

import thread.MyThread;

public class Demo1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("坦克");
        MyThread t2 = new MyThread("飞机");
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
