package lang.object.immutable.change;

public class MutableObj {

    private int value;

    public MutableObj(final int value) {
        this.value = value;
    }

    public void add(int addValue) {
        value = value + addValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }
}
