package BankingSystem;

public class UnauthorizedPinException extends Exception {
    public UnauthorizedPinException(String message) {
        super(message);
    }
}