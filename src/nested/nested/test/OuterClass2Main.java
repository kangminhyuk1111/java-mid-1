package nested.nested.test;

public class OuterClass2Main {

    public static void main(String[] args) {
        final OuterClass2 outerClass2 = new OuterClass2();
        final OuterClass2.InnerClass innerClass = outerClass2.new InnerClass();
    }
}
