package time;

import java.time.Instant;

public class InstantMain {

    public static void main(String[] args) {

        Instant now = Instant.now();

        System.out.println("now = " + now);

        Instant instant = Instant.ofEpochSecond(0);

        System.out.println("instant = " + instant);

        Instant instant1 = instant.plusSeconds(3600);

        System.out.println("instant1 = " + instant1);


    }
}
