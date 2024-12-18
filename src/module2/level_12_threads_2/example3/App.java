package module2.level_12_threads_2.example3;

public class App {
    static int a = 7;

    public static void main(String[] args) {

        // a++; // НЕ АТОМАРНА
        // 1 ПОЛУЧИТЬ ТЕКУЩЕЕ ЗНАЧЕНИЕ
        // 2 ПРИБАВИТЬ 1
        // 3 СОХРАНТЬ НОВОЕ ЗНАЧЕНИЕ

        new MyT().start();
        new MyT().start();

    }
}

class MyT extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            App.a++;
        }
    }
}
