package nested.nested.anonymous.ex0;

import java.util.Random;

public class Ex1RefMainV1 {

    public static void hello(Process process) {
        System.out.println("start");

        process.run();

        System.out.println("end");
    }

    static class Dice implements Process {
        @Override
        public void run() {
            final int randomValue = new Random().nextInt(6) + 1;
            System.out.println("randomValue = " + randomValue);
        }
    }

    static class Sum implements Process {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }
}
