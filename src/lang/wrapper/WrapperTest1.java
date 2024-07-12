package lang.wrapper;

public class WrapperTest1 {

    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        final int a = Integer.parseInt(str1);
        final int b = Integer.parseInt(str2);

        System.out.println(a+b);
    }
}
