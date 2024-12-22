package module2.level_13_executor.example3;

import module2.level_07_casting.example1.Run;

import java.util.concurrent.*;

public class App2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Я НЕКАЯ ВНЕШНЯЯ СИЛА
        // КОТОРАЯ СОЗДАЕТ ПУЛ ПОТОКОВ ("ГРУППУ ПОТОКОВ")
        ExecutorService threadPool = Executors.newFixedThreadPool(8);

//       Thread t1 = new Thread();
//        Thread t2 = new Thread();
//        Thread t3 = new Thread();
//        Thread t4 = new Thread();
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();


        // Я МНОГОПОТОЧНАЯ ЗАДАЧА
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };

        MyRun myRun = new MyRun();
        MyAnotherRun myAnotherRun = new MyAnotherRun();
        MyC myC = new MyC();

        threadPool.execute(myRun);
        threadPool.execute(myAnotherRun);
        threadPool.execute(myRun);
        threadPool.execute(myAnotherRun);
        threadPool.execute(myRun);
        threadPool.execute(myAnotherRun);
        threadPool.execute(r);

        Future<Integer> future = threadPool.submit(myC);
        Integer i = future.get();

        MyThirdRun myThirdRun = new MyThirdRun(future.get());
        threadPool.execute(myThirdRun);

        threadPool.shutdown();

    }
}

class MyRun implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
    }
}

class MyAnotherRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Привет я креветка!");
    }
}

class MyThirdRun implements Runnable {
    Integer fromCallable;

    public MyThirdRun(Integer fromCallable) {
        this.fromCallable = fromCallable;
    }

    @Override
    public void run() {
        System.out.println("Я ИЗ КОЛЛАБЛ " + fromCallable);
    }
}

class MyC implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Я коллабл");
        int a = 0;
        for (int i = 1; i < 11; i++) {
            a = i;
        }
        return a;
    }
}
