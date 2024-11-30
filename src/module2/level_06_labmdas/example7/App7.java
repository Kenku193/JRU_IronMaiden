package module2.level_06_labmdas.example7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App7 {
    public static void main(String[] args) {

        // КОЛЛЕКЦИЯ, В КОТОРОЙ БУДЕМ ХРАНИТЬ ОБЪЕКТЫ Car
        ArrayList<Car> garage = new ArrayList<>();

        // ДОБАВЛЯЕМ ОБЪЕКТЫ В КОЛЛЕКЦИЮ
        garage.add(new Car(Color.RED, "TOYOTA", 150, 1992));
        garage.add(new Car(Color.GREEN, "NISSAN", 200, 2001));
        garage.add(new Car(Color.INDIGO, "HONDA", 220, 2020));
        garage.add(new Car(Color.RED, "BMW", 1, 1995));
        garage.add(new Car(Color.RED, "BMW", 1, 2020));
        garage.add(new Car(Color.RED, "BMW", 1, 2024));
        garage.add(new Car(Color.YELLOW, "MASERATI", 1000, 1992));
        garage.add(new Car(Color.BLUE, "TESLA", 999, 1993));

//        System.out.println(selectCarsByColor(garage, Color.RED));
        // ПРЕДПОЛОЖИМ МНЕ НУЖНО ОТОБРАТЬ ЕЩЕ И ТЕ МАШИНЫ, КОТОРЫЕ ВЫПУЩЕНЫ ПОСЛЕ 2020-го ГОДА
        // ЧТО ДЕЛАТЬ? ПИСАТЬ ЕЩЕ ОДИН МЕТОД, И КАК-ТО ПЕРЕДАВАТЬ В НЕГО КОЛЛЕКЦИЮ
        // ПОСЛЕ ПРЕДЫДУЩЕГО

        // ПРИМЕР ЦЕПОЧКИ ВЫЗОВОВ ДЛЯ ФИЛЬТРАЦИИ
        List<Car> collect = garage
                .stream() // 1 ЗАПУСТИЛИ ПОТОК ДАННЫХ
                .filter(car -> car.color.equals(Color.RED)) // ФИЛЬТР ПО ЦВЕТУ
                .filter(car -> car.year > 2010) // ФИЛЬТР ПО ГОДУ
                .collect(Collectors.toList()); // СОБРАЛИ РЕЗУЛЬТАТ

        System.out.println(collect);

    }

    // ПРИМЕР ФИЛЬТРАЦИИ ПРИ ПОМОЩИ ОБЫЧНОГО МЕТОДА
    static List<Car> selectCarsByColor(List<Car> carList, Color c) {
        List<Car> selected = new ArrayList<>();

        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).color == c) {
                selected.add(carList.get(i));
            }
        }
        return selected;
    }

}
