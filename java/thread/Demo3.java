package thread;

import java.util.concurrent.FutureTask;

public class Demo3 {
    // 创建
    MyThread3 mt = new MyThread3();
    // 创建FutureTask对象管理多线程运行结果
    FutureTask<Integer> ft = new FutureTask<>(mt);
    Thread t1 = new Thread(ft);
//    t1.start();
}
