package module1.level19_singletoneSwitchEnum.switchExample;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        System.out.println("ДОБРО ПОЖАЛОВАТЬ В ПРОГРАММУ");
        System.out.println("ВЫБЕРИТЕ ПУНКТ МЕНЮ");
        System.out.println("1: ЗАШИРОФВАТЬ");
        System.out.println("2: РАСШИРОФВАТЬ");
        System.out.println("3: ВЫХОД");

        Scanner console = new Scanner(System.in);
        switch (console.nextInt()) {
            case 1: Cypher.encypt(); break;
            case 2: Cypher.decypt(); break;
            case 3: {
                System.out.println("ДО СКОРЫХ ВСТРЕЧ");
                System.exit(0);
            }
        }

    }
}

class Cypher {
    // ШИФРУЮЩИЙ МЕТОД
    static void encypt() {
        System.out.println("ЗАШИФРОВАНО");
    }

    // ДЕШИФРУЮЩИЙ МЕТОД
    static void decypt() {
        System.out.println("РАСШИФРОВАНО");
    }
}
