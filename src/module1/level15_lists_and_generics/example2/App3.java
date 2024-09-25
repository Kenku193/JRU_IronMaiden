package module1.level15_lists_and_generics.example2;

import java.util.ArrayList;

public class App3 {
    public static void main(String[] args) {

        ArrayList someList = new ArrayList<>();

        Object o = new Object();
        String s = new String("Привет!");
        Integer i = 222;
        Boolean b = true;

        someList.add(o);
        someList.add(s);
        someList.add(i);
        someList.add(b);

        System.out.println(someList);

    }
}
