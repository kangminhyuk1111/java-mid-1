package exception.ex2;

import java.util.Scanner;

public class MainV2 {

    public static void main(String[] args) throws NetworkClientExceptionV2 {
//        final NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
//        final NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
//        final NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
        final NetworkServiceV2_5 networkService = new NetworkServiceV2_5();

        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            final String input = scanner.nextLine();

            if(input.equals("exit")){
                break;
            }

            networkService.sendMessage(input);
            System.out.println();
        }

        System.out.println("프로그램을 정상 종료 합니다.");
    }
}