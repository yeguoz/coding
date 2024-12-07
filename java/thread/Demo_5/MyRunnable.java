package thread.Demo_5;


class MyRunnable implements Runnable{

    int ticket = 1;
    @Override
    public void run() {
        while (true){
            //如果为true（ticket>100）则直接break，如果为false（ticket<=100）则继续循环
            if (method()) break;

        }

    }

    private synchronized boolean method() {
        if (ticket > 100){
            return true;
        }
        System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
        ticket++;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return false;

    }
}
