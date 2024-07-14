package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();

        System.out.println("now = " + now);

        LocalDateTime localDateTime = now.toLocalDateTime();

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Seoul"));

        System.out.println("zonedDateTime = " + zonedDateTime);

        ZonedDateTime utc = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));

        System.out.println("utc = " + utc);
    }
}
