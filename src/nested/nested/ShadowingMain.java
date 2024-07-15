package nested.nested;

public class ShadowingMain {

    // 다른 변수들을 가려서 보이지 않게 되는 것을 섀도잉 이라고 한다.

    // 다른 변수들을 가리더라도, 인스턴스의 참조를 이용하면 변수에 접근 할 수 있다. ->  어떻게든 접근 가능함.

    // 어쩔 수 없는 경우는 같은 이름을 사용 하는 것을 허락하지만, 프로그래밍의 명확성을 위해 되도록이면 독립적인 네이밍을 해주도록 하자.

    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3;

            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShadowingMain.this = " + ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain shadowingMain = new ShadowingMain();
        Inner inner = shadowingMain.new Inner();

        inner.go();
    }
}
