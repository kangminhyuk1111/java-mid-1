package exception.basic.checked;

public class CheckedCatchMain {

    public static void main(String[] args) {
        final Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
