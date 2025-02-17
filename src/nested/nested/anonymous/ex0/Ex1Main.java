package nested.nested.anonymous.ex0;

import java.util.Random;

public class Ex1Main {

    public static void helloDice() {
        class Dice implements Process {
            @Override
            public void run() {
                final int randomValue = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + randomValue);
            }
        }
    }

    public static void helloSum() {
        class Dice implements Process {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        final Dice dice = new Dice();
    }

    public static void hello(Process dice) {
        System.out.println("start");
        System.out.println("end");
    }

    public static void main(String[] args) {
        helloDice();
        helloSum();
    }
}
