package module1.level25_time;

import java.util.Date;

public class Example1 {
    public static void main(String[] args) {

        // milliseconds from 1 JAN 1970 -> UNIX Time
        Date date = new Date();
        long time = date.getTime(); // UNIX TIME JVM

        System.out.println(date);
        System.out.println(time);


    }
}
