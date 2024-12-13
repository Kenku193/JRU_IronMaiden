package module2.level_11_threads_1.example1;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {

        MyTh myTh1 = new MyTh();
        myTh1.start();


        for (int i = 0; i < 500; i++) {
            System.out.println("Шаг цикла №" + i + " поток " + Thread.currentThread().getName());
        }

    }
}
