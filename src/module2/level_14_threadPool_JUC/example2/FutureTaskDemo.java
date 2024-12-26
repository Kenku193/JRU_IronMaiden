package module2.level_14_threadPool_JUC.example2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//         С JAVA 8+ МОЖНО ИСПОЛЬЗОВАТЬ ЛЯМБДЫ
//         Callable<Integer> callTh = () -> {Thread.sleep(500); return 500;};
        Callable<Integer> callTh = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(1500);
                return 440;
            }
        };

        // FUTURETASK (НАСЛЕДНИК FUTURE) БЕЗ ЭКЗЕКЬЮТОРА, ЕГО НАДО ЗАПУСКАТЬ ПЕРЕДАВ CALLABLE
        FutureTask<Integer> task = new FutureTask<>(callTh);
        task.run();
        try{
            System.out.println("Result: " + task.get());
        }
        catch (InterruptedException | ExecutionException e){
            System.out.println("А здесь я поймал эксепшен из коллабл");
            e.printStackTrace();
        }

        // ПРОСТОЙ FUTURE В КОТОРЫЙ ПРИХОДИТ ПОТОК ИЗ ЭКЗЕКЬЮТОРА
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        Future<Integer> submit = executorService.submit(callTh);
//        System.out.println(submit.get());
    }
}
