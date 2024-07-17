package exception.basic.unchecked;

public class UncheckedCatchMain {

    public static void main(String[] args) {
        final Service service = new Service();
        service.callCatch();
        service.hello();
        System.out.println("정상 종료");
    }
}
