package module2.level_06_labmdas.example1;

import java.util.ArrayList;
import java.util.Collections;

public class App1 {
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

        // StringComparator stringComparator = new StringComparator();
        // Collections.sort(week, stringComparator);

         Collections.sort(week, new StringComparator());

        System.out.println(week);

    }
}
