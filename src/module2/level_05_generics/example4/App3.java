package module2.level_05_generics.example4;

import java.util.ArrayList;
import java.util.List;

public class App3 {

    public static void addNumbers(List<? super Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);

    }

    public static void main(String[] args) {

        List<Object> objects = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        addNumbers(objects); // Разрешено, потому что объекты - супертип Integer'а
        addNumbers(numbers); // Разрешено, потому что объекты - супертип Integer'а
        addNumbers(integers); // Разрешено, потому что объекты - Integer

        System.out.println(objects);
        System.out.println(numbers);
        System.out.println(integers);

    }
}
