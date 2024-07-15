package nested.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        // 지역 변수는 무조건 final -> 변경되면 안된다. 변경되는 순간 compile error

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역변수보다 더 오래 살아 남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();

        // printer.print(); 여기서 실행하지 않고 Printer 인스턴스만 반환한다.

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV3 = new LocalOuterV3();

        Printer process = localOuterV3.process(2);

        process.print();

        Field[] fields = process.getClass().getDeclaredFields();

        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
