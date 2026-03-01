package BankingSystem;

public class User implements Authentication {

    private String name;
    private Account account;

    public User(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void login(int pin) throws UnauthorizedPinException {
        if (account.validatePin(pin)) {
            System.out.println("Login Successful");
        } else {
            throw new UnauthorizedPinException("Invalid PIN");
        }
    }

    public Account getAccount() {
        return account;
    }
}