package nested.nested.anonymous.ex0;

import java.util.Random;

public class Ex1RefMainV5 {

    public static void hello(Process process) {
        System.out.println("start");

        process.run();

        System.out.println("end");
    }

    public static void main(String[] args) {
        hello(() -> {
            final int randomValue = new Random().nextInt(6) + 1;
            System.out.println("randomValue = " + randomValue);
        });

        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}
