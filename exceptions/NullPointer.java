package exceptions;

public class NullPointer {
    public void showLength() {
        try {
            String str = null;
            System.out.println(str.length());  
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}

