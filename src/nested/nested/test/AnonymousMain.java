package nested.nested.test;

public class AnonymousMain {

    public static void main(String[] args) {

        final Hello hello = () -> System.out.println("AnonymousMain.hello");

        hello.hello();
    }
}
