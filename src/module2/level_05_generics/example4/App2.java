package module2.level_05_generics.example4;

import java.util.ArrayList;
import java.util.List;

public class App2 {

    public static double sum(List<? extends Number> numbers){
        double total = 0;
        for (Number number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {

            List<Integer> l1 = new ArrayList<>();
            l1.add(1);
            l1.add(2);
            l1.add(3);

            List<Double> l2 = new ArrayList<>();
            l2.add(1.5);
            l2.add(2.7);

            List<String> strings = new ArrayList<>();
            strings.add("ds");
            strings.add("ddss");

        System.out.println(sum(l1));
        System.out.println(sum(l2));


    }

    }

