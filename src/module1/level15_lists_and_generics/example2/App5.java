package module1.level15_lists_and_generics.example2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class App5 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        strings.add("Привет!");
        strings.add("Я");
        strings.add("студент");
        strings.add("курса");
        strings.add("Привет!");
        strings.add("JRU");

        System.out.println(strings);

        strings.remove("Привет!");
        strings.remove("Привет!");
        // СРАВНИТЬ -> equals, СОРТИРОВАТЬ -
        // ПОНИМАТЬ КТО БОЛЬШЕ, А КТО МЕНЬШЕ

        System.out.println(strings);

        strings.clear();
        System.out.println(strings.isEmpty());
    }
}
