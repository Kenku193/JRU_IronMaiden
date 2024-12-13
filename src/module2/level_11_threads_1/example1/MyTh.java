package module2.level_11_threads_1.example1;

public class MyTh extends Thread {
    @Override
    public void run() { // ХРАНИЛИЩЕ КОДА, КОТОРЫЙ МОЖЕТ ВЫПОЛНЯТЬСЯ МНОГОПОТОЧНО (ПАРАЛЛЕЛЬНО)

        // ЗАДАЧА (TASK)
        for (int i = 0; i < 500; i++) {
            System.out.println("Шаг цикла №" + i + " поток " + Thread.currentThread().getName());
        }

    }
}
