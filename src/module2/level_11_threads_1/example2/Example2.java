package module2.level_11_threads_1.example2;

public class Example2 {
    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        Thread thread1 = new Thread(counter1);
        Thread thread2 = new Thread(counter2);

        thread1.start();
        thread2.start();



    }
}
