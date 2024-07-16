package exception.basic.checked;

public class CheckedThrowMain {

    public static void main(String[] args) {
        final Service service = new Service();
        try {
            service.catchThrow();
        } catch (MyCheckedException e) {
            System.out.println(e.getMessage()+" -> error");
        }
        System.out.println("정상 종료");
    }
}
