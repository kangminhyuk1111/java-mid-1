package lang.system;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간을 가져온다.
        final long l = System.currentTimeMillis();
        System.out.println("l = " + l);

        final long l1 = System.nanoTime();
        System.out.println("l1 = " + l1);

        System.out.println(System.getenv());

        System.out.println("properties : " + System.getProperties());

        char[] originalArray = {'h','e','l','l','o'};
        final char[] copiedArray = new char[5];
    }
}
