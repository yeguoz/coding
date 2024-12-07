package thread.demo_7;

public class Cook extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                }
                //判断桌子上是否有面条
                //如果有就等待并唤醒吃货
                if (Desk.foodFlag == 1) {
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                //如果没有就做面条并将信号设置为1
                System.out.println("厨师开始做了1碗面条");
                Desk.foodFlag = 1;
                Desk.lock.notifyAll();
            }
        }
    }
}
