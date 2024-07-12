package lang.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {
        final Class helloClass = Hello.class;

        final Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        final String hello1 = hello.hello();
        System.out.println(hello1);
    }
}
