package module1.level17_collections_2;

import java.util.HashMap;
import java.util.TreeMap;

public class Example6 {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(734272, "Алексей Ольгович");
        map.put(3427923, "Оксана Василисовна");
        map.put(12, "Нарцисса Лестренджевна");
        map.put(999, "Альбус Дамблдорович");
        System.out.println(map);

        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("Иванов", 1000);
        stringTreeMap.put("Здоровый", 1);
        stringTreeMap.put("Петров", 100);
        stringTreeMap.put("Сидоров", 9000);
        stringTreeMap.put("Здоровий", 1);
        System.out.println(stringTreeMap);

    }
}
