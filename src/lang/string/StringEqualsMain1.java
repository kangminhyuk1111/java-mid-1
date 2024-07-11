package lang.string;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        final String s1 = new String("hello");
        final String s2 = new String("hello");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3 = "hello";
        String s4 = "hello";

        System.out.println(s3==s4);
        System.out.println(s3 .equals(s4));
    }

}
