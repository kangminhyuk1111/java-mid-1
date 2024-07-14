package enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("HTTP CODE :");
        int httpStatusCode = scanner.nextInt();

        HttpStatus status = HttpStatus.findByCode(httpStatusCode);
        System.out.println("status = " + status);


    }
}
