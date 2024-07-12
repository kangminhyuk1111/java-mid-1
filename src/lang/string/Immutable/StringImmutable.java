package lang.string.Immutable;

public class StringImmutable {

    public static void main(String[] args) {
        String str = "hello";
        final String str2 = str.concat(" java");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
    }
}

