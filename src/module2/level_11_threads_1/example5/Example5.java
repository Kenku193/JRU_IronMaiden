package module2.level_11_threads_1.example5;

public class Example5 {
    public static void main(String[] args) throws InterruptedException {

        // МЫ СОЗДАЛИ ОБЪЕКТ УПРАВЛЕНИЯ ПОТОКОМ (ВНУТРИ ОПИСАНА ЗАДАЧА)
        Thready t = new Thready();
        // МЫ ЗАПУСКАЕМ В НОВОМ ПОТОКЕ ЭТУ ЗАДАЧУ
        t.start();

        // Я ПРИОСТАНАВЛИВАЮ ПОКОК main
        Thread.sleep(10000);

        t.isStopped = true;

        // ДАЛЬШЕ НИЧЕГО НЕТ

    }
}

class Thready extends Thread {
    boolean isStopped = false;

    @Override
    public void run() {

        while (true) {
            System.out.println("Tik");
            System.out.println("Tak");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (isStopped) {
                 break;
            }
        }
    }
}
