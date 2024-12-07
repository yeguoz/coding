package thread;

public class Demo2 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread t1 = new Thread(myThread2);
        Thread t2 = new Thread(myThread2);
        t1.setName("线程1：");
        t2.setName("线程2：");

        t1.start();
        t2.start();
    }
}
