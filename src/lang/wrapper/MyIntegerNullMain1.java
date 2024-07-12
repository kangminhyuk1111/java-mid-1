package lang.wrapper;

public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1),new MyInteger(0),new MyInteger(1)};

        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

    private static MyInteger findValue(MyInteger[] Arr, int target) {
        for (MyInteger myInteger : Arr) {
            if(myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}
