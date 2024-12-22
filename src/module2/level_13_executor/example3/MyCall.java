package module2.level_13_executor.example3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCall implements Callable<String> {
    String s;
    public MyCall(String s) {
        this.s = s;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Работает поточный объект импл Callable" + " " + s);
        return s + " My dear JR friend!";
    }
}

class Solution {
    public static void main(String[] args) throws Exception {

//        MyCall myCall = new MyCall("Hello!");
//        String call = myCall.call(); // main
//        System.out.println(call);

        // Execute -> .exe

        // ПО СВЕОЙ СУТИ - ПУЛ ПОТОКОВ - НАБОР ПОТОКОВ
        // НЕ ПРЕКРАЩАЕТ САМА РАБОТУ!
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        MyCall myCall1 = new MyCall("Я первая");
        MyCall myCall2 = new MyCall("Я вторая");
        MyCall myCall3 = new MyCall("Я третья");
        MyCall myCall4 = new MyCall("Я четвертая");

        Future<String> futureMyCall1 = executorService.submit(myCall1);
        System.out.println(futureMyCall1.get());
        Future<String> futureMyCall2 = executorService.submit(myCall2);
        System.out.println(futureMyCall2.get());
        Future<String> futureMyCall3 = executorService.submit(myCall3);
        System.out.println(futureMyCall3.get());
        Future<String> futureMyCall4 = executorService.submit(myCall4);
        System.out.println(futureMyCall4.get());

        for (int i = 0; i < 25; i++) {
            Future<String> stringFuture = executorService.submit(new MyCall(String.valueOf(i)));
            String s = stringFuture.get();
            System.out.println(s);
        }
    }
}
