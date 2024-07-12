package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class ClassGradeEx3_1 {

    public static void main(String[] args) {
        int price = 10000;

        final DiscountService discountService = new DiscountService();
        final int basic = discountService.discount(BASIC, price);
        final int gold = discountService.discount(GOLD, price);
        final int diamond = discountService.discount(DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
