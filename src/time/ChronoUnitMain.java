package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {

    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
//            System.out.println("value = " + value);
        }
        ChronoUnit hours = ChronoUnit.HOURS;
        System.out.println("hours = " + hours);
        long seconds = ChronoUnit.HOURS.getDuration().getSeconds();
        System.out.println("seconds = " + seconds);
        System.out.println("ChronoUnit.DAYS = " + ChronoUnit.DAYS);
        System.out.println("ChronoUnit.DAYS.getDuration().getSeconds() = " + ChronoUnit.DAYS.getDuration().getSeconds());

        LocalTime localTime = LocalTime.of(1, 10, 0);
        LocalTime localTime1 = LocalTime.of(1, 20, 0);

        long between = ChronoUnit.SECONDS.between(localTime, localTime1);
        System.out.println("between = " + between);
    }
}
