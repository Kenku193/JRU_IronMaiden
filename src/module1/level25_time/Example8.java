package module1.level25_time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Example8 {
    public static void main(String[] args) {

        ZoneId zone = ZoneId.systemDefault();
      //  System.out.println(zone);

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
            System.out.println(availableZoneId);
        }

        System.out.println("-".repeat(100));

        ZoneId parametrizedZone = ZoneId.of("Pacific/Tongatapu");
        ZonedDateTime now = ZonedDateTime.now(parametrizedZone);
        System.out.println(now);

    }
}
