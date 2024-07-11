package lang.immutable.adress;

public class MemberMainV1 {

    public static void main(String[] args) {
        final Address address = new Address("서울");

        final MemberV1 a = new MemberV1("회원A", address);
        final MemberV1 b = new MemberV1("회원B", address);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.getAddress().setValue("부산");
    }
}
