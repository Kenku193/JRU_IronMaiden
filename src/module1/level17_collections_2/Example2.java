package module1.level17_collections_2;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(        111, "Алексей Ольгович");
        map.put(        222, "Оксана Василисовна");
        map.put(        545, "Нарцисса Лестренджевна");
        map.putIfAbsent(987, "Альбус Дамблдорович");
        System.out.println(map);

        String s = map.get(222);
        System.out.println(s);

        System.out.println(map.containsKey(666));
        System.out.println(map.containsValue("АЛЬБУС ДАМБЛДОРОВИЧ"));

        map.remove(111);
        map.remove(222, "ОксанЙ Василисовна");
        System.out.println(map);

        // КОЛ-ВО СОДЕРЖАЩИХСЯ ВНУТРИ ПАР
        System.out.println(map.size());

        map.clear();
        System.out.println(map);



    }
}
