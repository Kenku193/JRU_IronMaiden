package module1.level17_collections_2;

import java.util.HashMap;

public class Example4 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(        111, "Алексей Ольгович");
        map.put(        222, "Оксана Василисовна");
        map.put(        545, "Нарцисса Лестренджевна");
        map.putIfAbsent(987, "Альбус Дамблдорович");

        // FOR В СТИЛЕ FOREACH - ВНУТРИ ВЫЗЫВАЕТСЯ ОБЪЕКТ-ИТЕРАТОР - ПОЧИТАЙТЕ
        // ConcurrentModificationException - ПОЧИТАЙТЕ
        for (var integer : map.keySet()) {
            map.put(1000, "Terminator");
            System.out.println(map.get(integer));
        }

    }
}
