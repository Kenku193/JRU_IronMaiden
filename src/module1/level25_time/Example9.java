package module1.level25_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example9 {
    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(dateTimeFormatter.format(localDateTime));

    }
}
