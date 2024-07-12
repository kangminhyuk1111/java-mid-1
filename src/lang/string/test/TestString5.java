package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        final String s = "hello.txt";
        final String s1 = ".txt";

        final int i = s.indexOf(s1);
        final String fileName = s.substring(0, i);
        final String extName = s.substring(i, s.length());

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
