package module1.level16_collections_1.example3;

import java.util.*;

public class App1 {
    public static void main(String[] args) {


        HashSet<String> hashSet = new HashSet<>();

        boolean add1 = hashSet.add("Привет!");
        System.out.println(add1);
        hashSet.add("Я");
        hashSet.add("Юра");

        boolean isRemoved = hashSet.remove("Юра");
        System.out.println(isRemoved);

        int size = hashSet.size();
        System.out.println(size);

        boolean add4 = hashSet.add("Привет!");
        System.out.println(add4);

        System.out.println(hashSet.size());

        hashSet.clear();
        System.out.println(hashSet.size());


    }
}
