package thread.demo_6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    static int ticket = 0;
   static Lock lock =  new ReentrantLock();
    @Override
    public void run(){
        while (true){
            try {
                lock.lock();
                if (ticket==100){
                    break;
                }
                ticket++;
                System.out.println(getName()+"卖出第"+ticket+"张票");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }

        }
    }
}
