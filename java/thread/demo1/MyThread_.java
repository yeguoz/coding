package thread.demo1;

public class MyThread_ extends Thread{
    public MyThread_() {
    }

    public MyThread_(String name) {
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+i+"HelloWorld");
        }
    }

}
