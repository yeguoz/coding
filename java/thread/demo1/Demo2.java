package thread.demo1;

import thread.MyThread;

public class Demo2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("女神");
        MyThread_ t2 = new MyThread_("备胎");
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
