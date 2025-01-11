package module2.level_11_threads_1.example1;


public class AnotherTh extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Другая какая-то задача");
        }
    }
}
