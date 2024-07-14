package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30),VIP(40);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    // Enum 도 클래스이기 때문에 생성자 메서드 등 여러가지를 사용이 가능하다.

    // 객체지향 캡슐화를 지키기 위해 내부에서 할인율을 적용해서 내보내줌
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
