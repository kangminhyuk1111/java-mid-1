package nested.nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        final InnerOuter innerOuter = new InnerOuter();
        final InnerOuter.Inner inner = innerOuter.new Inner();

        inner.print();

        System.out.println("inner = " + inner.getClass());

        // 클래스가 내부의 필드로 정의된다고 생각
    }
}
