package module1.level25_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.IsoEra;

public class Example6 {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate localDate = LocalDate.of(1987, Month.JULY, 1);
        LocalTime localTime = LocalTime.of(23, 12, 25);
        LocalDateTime localDateTime = LocalDateTime.of(1454, Month.APRIL, 2, 11, 12, 14);

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        IsoEra era = localDate.getEra();
        System.out.println(era);

    }
}
