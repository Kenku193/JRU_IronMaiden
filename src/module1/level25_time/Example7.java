package module1.level25_time;

import java.time.LocalDate;
import java.time.LocalTime;

public class Example7 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate dPlus = now.plusDays(1);
        LocalDate mPlus = now.plusMonths(20);
        LocalDate yPlus = now.plusYears(1);

        System.out.println("Прибавили день: " + dPlus);
        System.out.println("Прибавили месяц: " + mPlus);
        System.out.println("Прибавили год: " + yPlus);

        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);

        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIDNIGHT);



    }
}
