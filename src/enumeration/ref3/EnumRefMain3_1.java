package enumeration.ref3;

public class EnumRefMain3_1 {

    public static void main(String[] args) {
        int price = 10000;

        final DiscountService discountService = new DiscountService();
        final int basic = discountService.discount(Grade.BASIC, price);
        final int gold = discountService.discount(Grade.GOLD, price);
        final int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
