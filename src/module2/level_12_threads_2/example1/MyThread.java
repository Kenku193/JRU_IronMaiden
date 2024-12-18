package module2.level_12_threads_2.example1;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
        System.out.println(this.getState());
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getName() + " " + Thread.currentThread().threadId() + " " + this.getState());
        }
    }
}

class App {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread("Имя потока");
        t1.start();

        Thread.sleep(11000);
        System.out.println(t1.getState());

    }
}
