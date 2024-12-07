package thread.LxDemo4;

import java.util.Random;

public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    static double money = 100;
    static int count = 3;
    static final double MIN = 0.01;


    @Override
    public void run() {
        synchronized (MyThread.class) {
            // 如果是没有红包就打印没抢到

            if (count == 0) {
                System.out.println(getName() + "没抢到");
            } else {
                // 如果红包不等于0就执行
                double prize = 0;
                if (count == 1){
                    // 红包还有一个时候就直接那最后那个
                    prize = money;
                }else {
                    // 如果还有三个或者两个包时就随机包内钱大小
                    // 第一个包最大为99.98,后面除了最后一个包
                    Random r = new Random();
                    // money - (count -1) * MIN
                    double bound = money - (count - 1) * MIN;
                    prize = r.nextDouble(bound+1);
                    if (prize<MIN){
                        prize = MIN;
                    }
                }
                money = money - prize;
                count--;
                System.out.println(getName()+"抽到了"+prize);
            }

        }
    }
}
