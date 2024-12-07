package thread.demo2;

public class Demo1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread("坦克");

        t1.start();
        t2.start();
    }
}
