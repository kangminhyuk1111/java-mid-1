package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        final Child child = new Child();
        child.childMethod();
        child.parentMethod();

        final String string = child.toString();

        System.out.println(string);
    }
}
