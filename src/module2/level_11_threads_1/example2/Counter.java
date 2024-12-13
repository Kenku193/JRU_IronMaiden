package module2.level_11_threads_1.example2;

public class Counter implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("Шаг цикла №" + i + " поток " + Thread.currentThread().getName());
        }
    }
}
