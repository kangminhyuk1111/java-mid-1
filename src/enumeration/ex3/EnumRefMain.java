package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println(BASIC.getClass());
        System.out.println(GOLD.getClass());
        System.out.println(DIAMOND.getClass());

        System.out.println(refValue(BASIC));
        System.out.println(refValue(GOLD));
        System.out.println(refValue(DIAMOND));

        System.out.println(BASIC);
        System.out.println(GOLD);
        System.out.println(DIAMOND);
    }

    private static String refValue(Object grade){
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
