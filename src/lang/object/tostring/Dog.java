package lang.object.tostring;

public class Dog {

    private String dogName;
    private int age;

    public Dog(final String dogName, final int age) {
        this.dogName = dogName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
