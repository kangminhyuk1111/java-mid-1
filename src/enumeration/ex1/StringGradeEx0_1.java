package enumeration.ex1;

import enumeration.ex1.DiscountService;

public class StringGradeEx0_1 {

    public static void main(String[] args) {
        int price = 10000;

        final DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC,price);
        int gold = discountService.discount(StringGrade.GOLD,price);
        int diamond = discountService.discount(StringGrade.DIAMOND,price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
