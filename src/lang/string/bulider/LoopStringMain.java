package lang.string.bulider;

public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String result = "";

        for (int i = 0; i < 100000; i++) {
            result += "hello Java";
        }

        long endTime = System.currentTimeMillis();
        System.out.println("time : " + (endTime-startTime)+"ms");
    }
}