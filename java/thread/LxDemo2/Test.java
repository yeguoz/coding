package thread.LxDemo2;

public class Test {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);

        t1.setName("A");
        t2.setName("B");

        t1.start();
        t2.start();
    }
}
