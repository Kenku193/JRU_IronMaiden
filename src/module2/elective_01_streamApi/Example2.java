package module2.elective_01_streamApi;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(1000, 10, 20, 30, 20, 40, 1000, 50, 60, 100, 20, 90, 80);

//        Stream<Integer> stream = integerList.stream();
//
//        stream
//                .filter(i -> i > 40)
//                .forEach(System.out::println);
//
//        stream
//                .filter(n -> n > 50)
//                .forEach(System.out::println);

        integerList
                .stream()
                .filter(i -> i > 40)
                .forEach(System.out::println);

        System.out.println("-".repeat(100));

        integerList
                .stream()
                .filter(i -> i > 50)
                .forEach(System.out::println);

        System.out.println("-".repeat(100));

        List<Integer> collect = integerList
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("-".repeat(100));
        integerList
                .stream()
                .skip(5)
                .limit(3)
                .forEach(System.out::println);

    }
}
