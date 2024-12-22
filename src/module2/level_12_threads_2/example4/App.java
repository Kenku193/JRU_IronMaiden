package module2.level_12_threads_2.example4;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws InterruptedException {

        Object m = new Object(); // ВОТ ЭТОТ ОБЪЕКТ И БУДЕТ НЕПОСРЕДСТВЕННО МОНИТОРОМ (РЕГУЛЯТОРОМ)
        Stock stock = new Stock(m);

        List<Task> tasks = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            Task task = new Task(stock);
            tasks.add(task);
            task.start();
        }

        System.out.println("All started");

        // СЕРВИСНАЯ ЧАСТЬ - ЗАСТАВЛЯЕТ ДОЖДАТЬСЯ
        // ГЛАВНОМУ ПОТОКУ, ПОКА ВСЕ ОСТАЛЬНЫЕ ДОРАБОТАЮТ
        for (Task task : tasks) {
            task.join(); // ЭТО МЕТОД, КОТОРЫЙ СТАВИТ В ОЖИДАНИЕ НЕ ТОТ ПОТОК НА КОТОРОМ
            // ВЫЗВАН, А ТОТ, "ГДЕ" ВЫЗВАН
            // ПОТОК main СТАНЕТ В ОЖДАНИЕ, И ДОЖДЕТСЯ ПОКА ВСЕ ПОТОКИ task ДОРАБОТАЮТ
        }
        System.out.println(stock.fee);
    }
}
