package thread.LxDemo3;

public class MyThread implements Runnable {

    int number = 1;
    @Override
    public void run() {
        while (true) {
           synchronized (MyThread.class){
               if (number>100){
                   break;
               }
               if (number % 2 !=0){
                   System.out.println(Thread.currentThread().getName()+
                           "："+number);
               }
               number++;

           }
        }
    }
}
