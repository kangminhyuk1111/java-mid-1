package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        final Car modelY = new Car("model y");
        final Dog dog1 = new Dog("멍멍이1", 2);
        final Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println(modelY.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println(modelY);
        System.out.println(dog1);
        System.out.println(dog2);

        ObjectPrinter.print(modelY);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
    }
}
