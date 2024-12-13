package module2.level_11_threads_1.example1;

public class Bankomat extends Thread {
    @Override
    public void run() {
        System.out.println("ВЫДАТЬ ДЕНЬГИ");
    }

}
