package module1.level17_collections_2;

import java.util.*;

public class Example3 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(        111, "Алексей Ольгович");
        map.put(        222, "Оксана Василисовна");
        map.put(        545, "Нарцисса Лестренджевна");
        map.putIfAbsent(987, "Альбус Дамблдорович");
        System.out.println(map);

        // ПОЛУЧИТЬ ИЗ МАПЫ СЕТ КЛЮЧЕЙ
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);

        // ВЕРСИЯ 1
//        for (Integer integer : keySet) {
//            System.out.println(map.get(integer));
//        }

        // ВЕРСИЯ 2
        for (var integer : map.keySet()) {
            System.out.println(map.get(integer));
        }

        Collection<String> values = map.values();
        System.out.println(values);

    }
}
