package module2.level_12_threads_2.example4;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Stock {

    public static final Object monitor = new Object();

    public static Integer fee = 0; // КОМИССИЯ БИРЖИ

    public static void main(String[] args) throws InterruptedException {

        List<Task> tasks = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            Task task = new Task();
            tasks.add(task);
            task.start();
        }

        System.out.println("All started");

        for (Task task : tasks) {
            task.join();
        }

        System.out.println(fee);
    }
}

class Task extends Thread{
    @Override
    public void run() {

        //КАКОЙ- ТО КОД ЛЮБОЙ

        // КРИТИЧЕСКАЯ СЕКЦИЯ (ТУАЛЕТ С ДВЕРЬЮ И ЗАМАКОМ)
        // РЕГУЛИРУЕТ ДЖОСТУП ОБЪЕКТ-МОНИТОР
        // КТО В КАКОЙ ОЧЕРЕДНОСТИ БУДЕТ В ЭТОЙ СЕКИИ РАБОТАТЬ
        synchronized (Stock.monitor) {
            Stock.fee += getOneFee();
        }
        //КАКОЙ- ТО КОД ЛЮБОЙ
    }

    private int getOneFee(){
        return 1;
    }
}
