package lang.object.immutable.adress;

public class RefMain1_2 {

    public static void main(String[] args) {
        final Address a = new Address("서울");
        final Address b = new Address("서울");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
