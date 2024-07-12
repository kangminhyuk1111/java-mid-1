package lang.wrapper;

public class MyIntegerMethodMain1 {

    public static void main(String[] args) {
        final MyInteger myInteger = new MyInteger(10);
        final int i1 = myInteger.compareTo(5);
        final int i2 = myInteger.compareTo(10);
        final int i3 = myInteger.compareTo(20);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
