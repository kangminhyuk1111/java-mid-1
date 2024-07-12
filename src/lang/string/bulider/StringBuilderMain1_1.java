package lang.string.bulider;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4,"java");
        System.out.println("sb = " + sb);

        sb.delete(4, 8);
        System.out.println("sb = " + sb);

        sb.reverse();
        System.out.println("sb = " + sb);

        // StringBuilder to String
        final String string = sb.toString();
        System.out.println("string = " + string);
    }
}
