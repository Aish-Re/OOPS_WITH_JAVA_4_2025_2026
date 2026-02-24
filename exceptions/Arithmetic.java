package exceptions;

public class Arithmetic {
    public void divide() {
        try {
            int a = 10;
            int b = 0;
            int c = a/b;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
