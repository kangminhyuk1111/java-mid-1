package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        final Integer i = new Integer(10);
        final Integer integerObject = Integer.valueOf(10);
        System.out.println("i = " + i);
        System.out.println("integerObject = " + integerObject);
    }
}
