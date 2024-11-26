package module2.level_06_labmdas.example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App2 {
    public static void main(String[] args) {
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

//       Comparator<String> s = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int result = o1.length() - o2.length();
//                System.out.println(result);
//                return result;
//            }
//        };
//        Collections.sort(week, s);


        Collections.sort(week, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = o1.length() - o2.length();
                System.out.println(result);
                return result;
            }
        });

        System.out.println(week);
    }
}
