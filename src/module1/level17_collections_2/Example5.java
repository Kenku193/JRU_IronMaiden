package module1.level17_collections_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example5 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Алексей Ольгович");
        map.put(1, "Оксана Василисовна");
        map.put(2, "Нарцисса Лестренджевна");
        map.put(3, "Альбус Дамблдорович");

        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.get(i));
        }

        // ВХОЖДЕНИЕ - ТО ЧТО УЖЕ ГДЕ-ТО НАХОДИТСЯ (ОДНА ПАРА)
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer, String> pair = iterator.next();
            System.out.println("Ключ: " + pair.getKey() + " Значение: " + pair.getValue());
        }


    }
}
