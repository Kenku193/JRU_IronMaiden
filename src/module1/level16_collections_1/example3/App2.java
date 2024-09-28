package module1.level16_collections_1.example3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App2 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); // ВПУСТИТ
        numbers.add(1); // НЕ ВПУСТИТ
        numbers.add(3); // ВПУСТИТ
        numbers.add(1); // НЕ ВПУСТИТ
        numbers.add(2); // ВПУСТИТ
        numbers.add(4); // ВПУСТИТ
        numbers.add(2); // НЕ ВПУСТИТ
        numbers.add(3); // НЕ ВПУСТИТ
        numbers.add(4); // НЕ ВПУСТИТ

//        HashSet<Integer> unique = new HashSet<>(numbers);
//        System.out.println(unique.size());

        System.out.println(new HashSet<>(numbers).size());

    }
}
