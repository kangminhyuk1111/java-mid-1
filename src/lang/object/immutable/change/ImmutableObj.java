package lang.object.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(final int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        return new ImmutableObj(value + addValue);
    }

    public int getValue() {
        return value;
    }
}
