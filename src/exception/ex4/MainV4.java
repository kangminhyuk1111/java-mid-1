package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {

    public static void main(String[] args) {
//        final NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
//        final NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
//        final NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
//        final NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
        final NetworkServiceV5 networkService = new NetworkServiceV5();

        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            final String input = scanner.nextLine();

            if(input.equals("exit")){
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
        }

        System.out.println("프로그램을 정상 종료 합니다.");
    }

    // 공통 예외 처리
    private static void exceptionHandler(final Exception e) {
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out);

        if(e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
    }
}
