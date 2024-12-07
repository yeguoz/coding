package thread.LxDemo4;



public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("小q");
        MyThread t2 = new MyThread("小浩");
        MyThread t3 = new MyThread("小黑");
        MyThread t4 = new MyThread("小b");
        MyThread t5 = new MyThread("小嗷");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
