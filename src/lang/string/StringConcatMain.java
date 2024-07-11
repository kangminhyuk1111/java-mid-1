package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        final String hello = "hello";
        final String java = "java";

        final String concat = hello.concat(java);
        final String s = hello + java;

        System.out.println("s = " + s);
        System.out.println("concat = " + concat);
    }
}
