package module2.level_13_executor.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrioritiesFib {
    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        List<Thread> threadList = new ArrayList<>();

        // В ЦИКЛЕ СОЗДАЛ ПОТОКИ И НАЗНАЧИЛ РАНДОМНО ПРИОРИТЕТЫ
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(PrioritiesFib::doLongTime);
            if (new Random().nextBoolean()) {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            else {
                thread.setPriority(Thread.MIN_PRIORITY);
            }
            threadList.add(thread);
        }

        // ЗАПУСТИЛ ПОТОКИ
        for (Thread thread : threadList) {
            thread.start();
        }

        // ЗАСТАВИТЬ ПОТОК main ДОЖДАТЬСЯ ПОКА ВСЕ ЕГО ПОРОЖДЕНИЯ ЗАКОНЧАТ
        for (Thread thread : threadList) {
            thread.join(); // ТО ЕСТЬ ДОЖИДАТЬСЯ БУДЕТ ВЫЗЫВАЮЩИЙ ПОТОК -> main ДОЖДИСЬ thread
        }

        System.out.println("Main is finished!");
        System.out.println((System.currentTimeMillis() - start));
    }

    private static void doLongTime() {
        long startTime = System.currentTimeMillis();
        long fibonacci = fib(40); // ТЯЖЕЛАЯ ЗАДАЧА
        long finishTime = System.currentTimeMillis();
        System.out.println("Thread name = " + Thread.currentThread().getName()
                + "\nPriority = " + Thread.currentThread().getPriority()
                + "\nFibonacci = " + fibonacci
                + "\nDuration = " + (finishTime - startTime) + "ms"
                + "\n" + "-".repeat(50)
        );
    }

    // 55 -> 0 1 1 2 3 5 8
    private static long fib(int n) {
        if (Thread.currentThread().isInterrupted()) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

}
