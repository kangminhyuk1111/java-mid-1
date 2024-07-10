package lang.object.poly;

public class ObjectPolyExample2 {

    public static void main(String[] args) {
        final Dog dog = new Dog();
        final Car car = new Car();
        final Object o = new Object();

        Object[] objects = {dog, car, o};

        size(objects);
    }

    private static void size(final Object[] objects) {
        System.out.println("전달된 객체의 수는 : " + objects.length);
    }
}
