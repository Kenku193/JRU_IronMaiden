package module1.level25_time;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Example4 {
    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = null;

        simpleDateFormat = new SimpleDateFormat();
        System.out.println("Constructor 1: " + simpleDateFormat.format(date));

        simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println("Constructor 2: " + simpleDateFormat.format(date));

        simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.CHINESE);
        System.out.println("Constructor 3: " + simpleDateFormat.format(date));

        simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy", myDateFormatSymbols);
        System.out.println("Constructor 4: " + simpleDateFormat.format(date));

    }

    public static DateFormatSymbols myDateFormatSymbols= new DateFormatSymbols() {
        @Override
        public String[] getMonths() {
            return new String[]{"янва-ря", "февра-ля", "мар-та", "апре-ля", "ма-я", "ию-ня", "ию-ля",
                    "авгус-та", "сентя-бря", "октя-бря", "ноя-бря", "дека-бря"};
        }
    };
}
