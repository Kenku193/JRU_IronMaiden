package module1.level15_lists_and_generics.example2;

import java.util.ArrayList;

public class App6 {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        // ПОД КАПОТОМ МАССИВ НА 10 ЭЛ
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);
        // ЗДЕСЬ НАМ НЕ ХВАТИЛО МЕСТА В МАССИВЕ НА 10
        integers.add(11); // ЧТО СДЕЛАЕТ Java? *1.5

        // Java ПЕРЕСОЗДАСТ НОВЫЙ МАССИВ БОЛЬШЕГО РАЗМЕРА
        // НО ГЛАВНОЕ - СКОПИРУЕТ СОДЕРЖИМОЕ СТАРОГО МАССИВА В НОВЫЙ

    }
}
