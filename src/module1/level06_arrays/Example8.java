package module1.level06_arrays;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        // МАССИВ ДЛЯ ОБЪЕКТОВ КОТОВ
        Cat[] cats = new Cat[5];
        // ОТДЕЛЬНЫЕ КОТЫ
        Cat cat1; // ЗДЕСЬ БУДЕТ ССЫЛКА НА ОБЪЕКТ В ПАМЯТИ
        cat1 = new Cat(); // Я ОБЪЕКТ СОЗДАЛ, ССЫЛКА ЗАПИСАЛАСЬ
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();

        // В МАССИВ В ЯЧЕЙКУ С ИНДЕКСОМ
        // ЗАПИСЫВАЮ ЧТО?????
        cats[0] = cat1; // ССЫЛКУ НА ЭТОТ ОБЪЕКТ
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = cat4;
        cats[4] = cat5;

        System.out.println(cats[0]);

    }
}
