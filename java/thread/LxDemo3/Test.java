package thread.LxDemo3;

public class Test {
    public static void main(String[] args) {
        MyThread mt = new MyThread();


        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);

        t1.setName("线程1：");
        t2.setName("线程2：");

        t1.start();
        t2.start();

    }
}
