package module2.level_14_threadPool_JUC.example3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fixed {

    public static void main(String[] args) throws Exception {

        // СОЗДАЕМ ЭКЗЕКЬЮТОР С ФИКСИРОВАННЫМ КОЛИЧЕСТВОМ ПОТОКОВ
       ExecutorService myExecutor = Executors.newFixedThreadPool(8);

        // ПОТОК ДЛЯ ПРИМЕРА - БОЛЬШОЕ ВЫЧИСЛЕНИЕ И СЛИП
        Runnable t = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " " + Integer.MAX_VALUE * Long.MAX_VALUE + (Long.MAX_VALUE - Double.MIN_VALUE));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread a = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4000);
                    System.out.println(Thread.currentThread().getName() + " " + Integer.MAX_VALUE * Long.MAX_VALUE / 10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        // ЗАГОНЯЕМ В НАШ ЭКЗЕКЬЮТОР t 50 РАЗ
        for (int i = 0; i < 50; i++) {
            myExecutor.execute(t);
            myExecutor.execute(a);
        }

        // ПРИЗЫВАЕМ НАШ ЭКЗЕКЬЮТОР ЗАВЕРШИТЬСЯ
        myExecutor.shutdown();
    }
}
