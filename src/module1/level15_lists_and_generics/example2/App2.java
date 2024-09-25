package module1.level15_lists_and_generics.example2;

import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        Integer i1 = 10;
        Integer i2 = 20;
        Integer i3 = 30;
        Integer i4 = 40;

        integers.add(i1);
        integers.add(i2);
        integers.add(i3);
        integers.add(i4);

        System.out.println(integers);

        System.out.println(integers.get(3));
        System.out.println(integers.set(3, 999));
        System.out.println(integers.get(3));

    }
}
