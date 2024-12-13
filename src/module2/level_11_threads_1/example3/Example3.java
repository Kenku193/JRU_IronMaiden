package module2.level_11_threads_1.example3;

public class Example3 {
    public static void main(String[] args) {
        // TASK
        Runnable runnable = () -> {
            System.out.println("ВЫДАНЫ ДЕНЬГИ " + Thread.currentThread().getName());
        };

        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();

        new Thread(() -> {
            System.out.println("ВЫДАНЫ ДЕНЬГИ " + Thread.currentThread().getName());
        }).start();

    }
}
