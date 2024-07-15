package nested.nested.outer;

public class NestedOuterMain {

    public static void main(String[] args) {

        final NestedOuter nestedOuter = new NestedOuter();
        final NestedOuter.Nested nested = new NestedOuter.Nested();

        nested.print();

        System.out.println("nested = " + nested.getClass());
    }
}
