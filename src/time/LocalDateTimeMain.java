package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        LocalDate localDate = now.toLocalDate();
        LocalTime localTime = now.toLocalTime();

        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime localDateTime1 = localDateTime.plusDays(1000);
        System.out.println("localDateTime1 = " + localDateTime1);
    }
}
