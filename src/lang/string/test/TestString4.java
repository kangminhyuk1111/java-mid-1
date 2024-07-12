package lang.string.test;

public class TestString4 {

    public static void main(String[] args) {
        final String s = "hello.txt";
        final String fileName = s.substring(0, 5);
        final String extName = s.substring(5, s.length());

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
