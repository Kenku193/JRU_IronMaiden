package module1.level15_lists_and_generics.example2;

import java.util.ArrayList;

public class App8 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> outerArrayList = new ArrayList<>();

        outerArrayList.add(new ArrayList<Integer>());
        outerArrayList.add(new ArrayList<Integer>());
        outerArrayList.add(new ArrayList<Integer>());
        outerArrayList.add(new ArrayList<Integer>());

    }
}
