package module2.level_13_executor.example3;

import java.util.concurrent.Callable;

public class App {
    public static void main(String[] args) {

        Runnable rTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("я задачка");
            }
        };

        Thread t = new Thread(rTask);
        t.start();

        Callable<Integer> cTask = new Callable() {
            @Override
            public Integer call() throws Exception {
                System.out.println("я задачка");
                return null;
            }
        };

    }
}
