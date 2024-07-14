package enumeration.ref1;

public class ClassGrade {

    // 할인율의 대한 책임을 ClassGrade가 가지면서 코드가 간결해짐
    // 역할과 책임

    private final int discountPercent;

    public ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    public int getDiscountPercent() {
        return discountPercent;
    }
}
