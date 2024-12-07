package thread.demo_7;

public class Foodie extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                }

                // 判断有没有面条，
                //如果没有就等待，并唤醒cook线程
                if (Desk.foodFlag == 0) {
                    //没有面条等待
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                //如果有就开吃
                //将count-1
                Desk.count--;
                //吃完了设置信号为0让cook开始做
                System.out.println("吃货吃了一碗面条还能再吃" + Desk.count + "碗面条");
                Desk.foodFlag = 0;
                Desk.lock.notifyAll();

            }
        }
    }
}
