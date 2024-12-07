package thread.LxDemo1;

public class MyThread extends Thread {
    static int ticket = 1000;


    @Override
    public void run() {
        while (true) {

            synchronized (MyThread.class){
                if (ticket == 0) {
                    break;
                }
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket--;
                    System.out.println(getName() +
                            "卖出了1张票还剩" + ticket + "张票");



            }


        }
    }

}
