package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        final DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);

        System.out.println("vip = " + vip);
    }
}
