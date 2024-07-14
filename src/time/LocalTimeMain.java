package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();

        System.out.println("now = " + now);

        LocalTime localTime = LocalTime.of(11, 11, 11);

        System.out.println("localTime = " + localTime);
    }
}
