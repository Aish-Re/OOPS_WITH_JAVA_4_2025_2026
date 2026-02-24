package exceptions;

public class Main {
    public static void main(String[] args) {
        Arithmetic obj1 = new Arithmetic();
        obj1.divide();
        NullPointer obj2 = new NullPointer();
        obj2.showLength();
        ArrayIndex obj3 = new ArrayIndex();
        obj3.accessArray();
        StringIndex obj4 = new StringIndex();
        obj4.accessString();
    }
}