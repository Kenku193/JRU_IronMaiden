package module2.level_06_labmdas.example5;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class App5 {
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

//        for (String s : week) {
//            System.out.println(s);
//        }
       //  Consumer  (a) -> действие с этим а
        week.stream().forEach(s -> System.out.println(s));

        // :: - ссылка на метод
        //week.stream().forEach(System.out::println); // ДЛЯ КАЖДОГО ЭЛ-ТА КОЛ-ЦИИ ВЫЗОВИ НА System.out МЕТОД println

    }
}
