package module2.level_06_labmdas.example3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App3 {
    public static void main(String[] args) {

        Integer s = 10;

        ArrayList<String> week = new ArrayList<>();
        {
            week.add("Понедельник");
            week.add("Вторник");
            week.add("Среда");
            week.add("Четверг");
            week.add("Пятница");
            week.add("Суббота");
            week.add("Воскресенье");
        }

        System.out.println(week);

//        Collections.sort(week, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        Collections.sort(week, (left, right) -> left.length() - right.length());

        System.out.println(week);
    }
}
