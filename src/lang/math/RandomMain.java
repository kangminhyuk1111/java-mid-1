package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        final Random random = new Random(1);

        final int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        final double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        final boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        final int randomRange1 = random.nextInt(10);
        System.out.println("randomRange1 = " + randomRange1);

        final int randomRange2 = random.nextInt(10) + 1;
        System.out.println("randomRange2 = " + randomRange2);
    }
}
