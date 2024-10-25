package module1.level25_time;

import java.util.Date;

public class Example3 {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        System.out.println("Год: " + date.getYear());
        System.out.println("Месяц: " + date.getMonth());
        System.out.println("День: " + date.getDate());

    }
}
