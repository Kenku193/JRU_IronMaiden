package module1.level11_oop;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // СОЗДАЛ ПЕРЕМЕННУЮ с И ПОТОМ ПОСЛЕ = СОЗДАЛ ОБЪЕКТ
        Cat c = new Cat();
        Cat b = new Cat();

        Cat myCat;

        // ЧТО Я ЗАПИСАЛ?
        myCat = c; // СЫЛКУ

        System.out.println(c);
        System.out.println(myCat);

        myCat = null;
        c = null;




    }
}
