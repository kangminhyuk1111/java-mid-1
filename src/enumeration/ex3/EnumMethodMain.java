package enumeration.ex3;

public class EnumMethodMain {

    public static void main(String[] args) {

        // 모든 enum 반환
        Grade[] values = Grade.values();

        for (Grade value : values) {
            System.out.println(value.ordinal());
            System.out.println(value.name());
        }

        // String to Enum
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);

        // ordinal은 가급적 사용을 금지한다..
        // 중간에 상수를 사용하는 위치가 변경되면 모든 상수의 ordinal이 변경될 수 있기 때문에.

        // 열거형은 java.lang.Enum을 강제로 상속 받는다.
        // 이미 상속 받았기 때문에 다른 클래스를 상속 받을 수 없다.
    }
}
