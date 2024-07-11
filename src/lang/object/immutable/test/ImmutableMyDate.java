package lang.object.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(final int year, final int month, final int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear,month,day);
    }

    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(year,newMonth,day);
    }

    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(year,month,newDay);
    }

    @Override
    public String toString() {
        return "ImmutableMyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
