package enumeration.ex2;

public class ClassGradeEx2_1 {

    public static void main(String[] args) {
        int price = 10000;

        final DiscountService discountService = new DiscountService();
        final int basic = discountService.discount(ClassGrade.BASIC, price);
        final int gold = discountService.discount(ClassGrade.GOLD, price);
        final int diamond = discountService.discount(ClassGrade.DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
