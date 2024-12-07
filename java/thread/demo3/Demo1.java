package thread.demo3;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("飞机");
        t1.start();
        t1.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("main"+i);

        }
    }
}
