package module1.level25_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        // 24-10-25 21:02:30

        Scanner console = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        LocalDate date = LocalDate.parse(console.nextLine(), formatter);
        System.out.println(date);


    }
}
