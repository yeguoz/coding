package thread;

public class Demo5 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();

        System.out.println("11111111");
        Thread.sleep(1000);
        System.out.println("22222222");
    }
}
