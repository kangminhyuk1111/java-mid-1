package time;

import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class ChronoFieldMain {

    public static void main(String[] args) {
        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
//            System.out.println(value + ", range = " + value.range());
        }
        ValueRange range = ChronoField.MONTH_OF_YEAR.range();
        System.out.println("range = " + range);
        ValueRange range1 = ChronoField.DAY_OF_MONTH.range();
        System.out.println("range1 = " + range1);
    }
}
