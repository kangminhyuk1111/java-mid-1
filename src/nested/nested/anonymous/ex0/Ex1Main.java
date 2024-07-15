package nested.nested.anonymous.ex0;

import java.lang.reflect.Field;

public class Ex1Main {

    Hello helloJava = new Hello() {
        @Override
        public void hello() {
            System.out.println("start");
            System.out.println("hello java");
            System.out.println("end");
        }
    };

    Hello helloSpring = new Hello() {
        @Override
        public void hello() {
            System.out.println("start");
            System.out.println("hello java");
            System.out.println("end");
        }
    };

    public static void main(String[] args) {
        Field[] declaredFields = new Ex1Main().getClass().getDeclaredFields();

        for (Field declaredField : declaredFields) {
            String name = declaredField.getName();

            System.out.println(name);
        }
    }
}
