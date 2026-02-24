package exceptions;

public class ArrayIndex {
    public void accessArray() {
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[7]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

