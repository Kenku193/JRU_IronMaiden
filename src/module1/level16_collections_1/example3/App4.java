package module1.level16_collections_1.example3;

import java.util.HashSet;
import java.util.Iterator;

public class App4 {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(7);
        hs.add(9);
        hs.add(-11);
        hs.add(555);

        Iterator<Integer> iterator = hs.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        for (Integer h : hs) {
            System.out.println(h + 999);
        }


    }
}
