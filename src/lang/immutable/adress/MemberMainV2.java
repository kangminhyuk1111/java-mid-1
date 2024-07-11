package lang.immutable.adress;

public class MemberMainV2 {

    public static void main(String[] args) {
        final ImmutableAddress address = new ImmutableAddress("서울");

        final MemberV2 a = new MemberV2("회원A", address);
        final MemberV2 b = new MemberV2("회원B", address);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setAddress(new ImmutableAddress("부산"));
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
