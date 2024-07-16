package nested.nested.test;

public class OuterClass3 {
    public void myMethod() {

        class LocalClass {
            public void hello() {
                System.out.println("hello");
            }
        }

        final LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}