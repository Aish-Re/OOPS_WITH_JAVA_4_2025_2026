package BankingSystem;

public interface Authentication {
    void login(int pin) throws UnauthorizedPinException;
}
