package thread.demo_7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Desk {
    // 0 没有面条，1 有面条
    static int foodFlag = 0;
    static int count = 10;
    static Lock lock = new ReentrantLock();
}
