package thread.LxDemo2;

public class MyThread implements Runnable {

    int gift = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (MyThread.class) {
                if (gift < 10) {
                    break;
                }
                gift--;
                System.out.println(Thread.currentThread().getName() +
                        "送出了一个礼物还剩" + gift + "礼物");


            }

        }

    }
}
