package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime, endTime;

        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++){
            sumPrimitive += i;
        }

        endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime+"ms");

        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++){
            sumPrimitive += i;
        }

        endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime+"ms");
    }
}
