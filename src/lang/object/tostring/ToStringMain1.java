package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        final Object object = new Object();
        final String string = object.toString();

        System.out.println(string);

        System.out.println(object);
    }
}
