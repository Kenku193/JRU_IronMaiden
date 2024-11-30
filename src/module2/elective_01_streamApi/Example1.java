package module2.elective_01_streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {

        ArrayList<Car> garage = new ArrayList<>();
        garage.add(new module2.elective_01_streamApi.Car("Toyota", "Silver"));
        garage.add(new module2.elective_01_streamApi.Car("BMW", "White"));
        garage.add(new module2.elective_01_streamApi.Car("VW", "Silver"));
        garage.add(new module2.elective_01_streamApi.Car("Ferrari", "Red"));
        garage.add(new module2.elective_01_streamApi.Car("Lada", "Black"));
        garage.add(new module2.elective_01_streamApi.Car("Tesla", "Green"));

        Stream<Car> streamNumber1 = garage.stream();

        // ПРИМЕР ПРИМЕНЕНИЯ Optional
//        Optional<Car> optionalCar = streamNumber1
//                .filter(c -> c.getColor().equals("Purple"))
//                .findFirst();
//        System.out.println(optionalCar.isPresent());

        Car silver = streamNumber1
                .filter(c -> c.getColor().equals("Silver"))
                .findFirst() // РАБОТА СТРИМОВ УЖЕ ЗАВЕРШЕНА! ДАЛЕЕ Я РАБОТАЮ С РЕЗУЛЬТАТОМ
                .orElseThrow();

        Stream<String> streamNumber2 = Stream.of("Один", "Два", "Три", "Четыре");

        Integer[] integers = {1,2,3,4,5,6};
        Stream<Integer> streamNumber3 = Arrays.stream(integers);

        // ПОЧИТАТЬ - ПАТТЕРН Builder
        Stream<Object> build = Stream.builder().add(0.9).add(1.11).add(21.3).add(987.4).build();

        // БЕСКОНЕЧНЫЙ СТРИМ ПРИМЕР 1
       // Stream.generate(() -> Math.random()).forEach(System.out::println);

        // БЕСКОНЕЧНЫЙ СТРИМ ПРИМЕР 2
        Stream.iterate(0, n -> n + 10).forEach(System.out::println);



    }
}
