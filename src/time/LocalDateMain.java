package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        System.out.println("now = " + now);

        LocalDate localDate = LocalDate.of(2013, 11, 21);

        System.out.println("localDate = " + localDate);

        LocalDate localDate2 = localDate.plusDays(8);

        System.out.println("localDate2 = " + localDate2);
    }
}
