package module2.elective_01_streamApi;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Один");
        strings.add("Два");
        strings.add("Три");

        strings
                .stream()
                .map((s) -> s + "_1")
                .forEach(System.out::println);


        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        integers
                .stream()
                .map((s) -> s + "_1")
                .forEach(System.out::println);

        Integer max = integers.stream().max(Integer::compareTo).orElseThrow();
        System.out.println("Max = " + max);

        Integer r = integers.stream().reduce((a, b) -> a + b).orElseThrow();
        System.out.println("Reduce = " + r);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(90));
        users.add(new User(100));
        users.add(new User(10));
        users.add(new User(20));

        users
                .stream()
                .map((s) -> s + "_1")
                .forEach(System.out::println);
    }
}
