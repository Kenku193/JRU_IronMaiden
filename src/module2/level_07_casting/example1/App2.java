package module2.level_07_casting.example1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {

        List<Integer> al;
        al = new ArrayList<Integer>();

        System.out.println(al instanceof List<Integer>);

        Cat cat = new Cat();

        List<? extends Serializable> serializables = List.of(1, "2", 1283.0, cat);


    }
}
