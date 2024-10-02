package module1.level17_collections_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Example1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(111, "Алексей Ольгович");
        map.put(222, "Оксана Василисовна"); // !!!
        map.put(545, "Нарцисса Лестренджевна");
        System.out.println(map);

//        // ДОБАВИТЬ ПАРУ С КЛЮЧОМ КОТОРЫЙ УЖЕ ЕСТЬ
//        map.put(222, "Альбус Дамблдорович");
//        // ПРОИЗОШЛА ПЕРЕЗАПИСЬ ЗНАЧЕНИЯ (VALUE)
//        System.out.println(map);

        // ДОБАВИТЬ ЕСЛИ ПУСТО
        map.putIfAbsent(222, "Альбус Дамблдорович"); // !!!
        System.out.println(map);

        map.put(987, "Альбус Дамблдорович");
        System.out.println(map);


    }
}
