package module2.level_05_generics.example4;

import java.util.ArrayList;
import java.util.List;

public class App1 {

    public static void printList(List<?> list){
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        List<String> l2 = new ArrayList<>();
        l2.add("Привет ");
        l2.add("мир!");

        printList(l1);
        printList(l2);

    }
}