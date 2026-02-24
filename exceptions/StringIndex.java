package exceptions;

public class StringIndex {
    public void accessString() {
        try {
            String str = "Hello";
            System.out.println(str.charAt(7)); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
