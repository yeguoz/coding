package thread.Deme_4;

public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    static int ticket = 0;
    static Object o = new Object();
    @Override
    public void run(){
        while (true){
           synchronized (o){
               ticket++;
                if (ticket < 101) {
                    System.out.println(getName() + "卖出去的第" + ticket + "张票");
                } else {
                    break;
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

// while (true) {
//synchronized (o) {
//        ticket++;
//        if (ticket < 101) {
//        System.out.println(getName() + "卖出去的第" + ticket + "张票");
//        } else {
//        break;
//        }
//        }
//
//        try {
//        Thread.sleep(10);
//        } catch (InterruptedException e) {
//        throw new RuntimeException(e);
//        }
//        }
