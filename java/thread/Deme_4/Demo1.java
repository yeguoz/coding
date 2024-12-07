package thread.Deme_4;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("窗口1");
        MyThread t2 = new MyThread("窗口2");
        MyThread t3 = new MyThread("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
