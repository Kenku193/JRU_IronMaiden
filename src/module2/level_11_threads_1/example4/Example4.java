package module2.level_11_threads_1.example4;

public class Example4 {

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = () -> {
            for (int i = 0; i < 500; i++) {
                System.out.println("Шаг цикла №" + i + " поток " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        new Thread(runnable).start();

        Thread.sleep(1000);

        System.out.println("Я работаю в потоке " + Thread.currentThread().getName());

    }

}


