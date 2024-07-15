package nested.nested.outer;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            System.out.println("nestedInstanceValue = " + nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근에는 접근할 수 없다.
            // System.out.println("outInstanceValue = " + outInstanceValue);
            
            // 바깥 클래스의 -정적- 인스턴스 멤버에는 접근할 수 있다.
            System.out.println("NestedOuter.outClassValue = " + NestedOuter.outClassValue);
        }
    }
}
