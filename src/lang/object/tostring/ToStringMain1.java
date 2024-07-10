package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        final Object o = new Object();
        final String string = o.toString();

        System.out.println(string);

        System.out.println(o);
    }
}
