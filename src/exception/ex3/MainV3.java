package exception.ex3;

import exception.ex2.NetworkClientExceptionV2;
import exception.ex2.NetworkServiceV2_5;

import java.util.Scanner;

public class MainV3 {

    public static void main(String[] args) {
//        final NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
//        final NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
//        final NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
//        final NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
        final NetworkServiceV3_2 networkService = new NetworkServiceV3_2();

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
