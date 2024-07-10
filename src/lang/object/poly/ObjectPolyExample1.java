package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        final Dog dog = new Dog();
        final Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        // obj.sound(); -> 컴파일 오류 Object는 sound()가 없다.
        // 객체에 맞는 다운 캐스팅을 해주면 호출 가능

        if(obj instanceof Dog dog) {
            dog.sound();
        } else if(obj instanceof Car car) {
            car.move();
        }
    }
}
