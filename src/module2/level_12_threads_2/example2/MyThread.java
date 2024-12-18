package module2.level_12_threads_2.example2;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println(this.getName() + " " + Thread.currentThread().threadId() + " " + this.getState());
        }
    }
}

class App {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

        t1.join(); // НЕ НА ТОМ ПОТОКЕ НА КОТОРОМ ВЫЗВАН, А ТОТ ПОТОК ИЗ КОТОРОГО ВЫЗВАН - ПОТОК main
        t2.join();
        System.out.println("Я вызов в потоке main");


    }
}