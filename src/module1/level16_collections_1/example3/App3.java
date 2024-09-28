package module1.level16_collections_1.example3;

import java.util.*;

public class App3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); // ВПУСТИТ
        numbers.add(5); // ВПУСТИТ
        numbers.add(7); // ВПУСТИТ
        numbers.add(-4); // ВПУСТИТ
        numbers.add(10); // ВПУСТИТ

        HashSet<Integer> hs = new HashSet<>(numbers);

        Iterator<Integer> iterator = hs.iterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());


//        while (iterator.hasNext()){
//            Integer next = iterator.next();
//            System.out.println(next);
//        }


    }
}
