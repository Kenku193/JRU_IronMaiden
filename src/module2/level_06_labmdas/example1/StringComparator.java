package module2.level_06_labmdas.example1;

import java.util.Comparator;

/**
 * Класс имплементирующий функциональный интерфейс {@code Comparator<T>}
 * <p>
 * Здесь мы описываем логику сравнения объектов
 * <p><p>
 * Метод compareTo в Java сравнивает вызывающий объект с объектом, переданным в качестве параметра,
 * и возвращает в результате выполнения сравнения целое число:
 * <p>
 * положительное, если вызывающий объект больше объекта, переданного в качестве параметра;
 * <p>
 * отрицательное, если вызывающий объект меньше объекта, переданного в качестве параметра;
 * <p>
 * ноль, если объекты равны.
 *
 */
public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) { // СОПОСТАВЛЯТЬ
        int result = o1.length() - o2.length();
        System.out.println(result);
        return result;
    }
}
