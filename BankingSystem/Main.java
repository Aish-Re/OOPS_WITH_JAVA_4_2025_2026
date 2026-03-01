package BankingSystem;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("MyBank");

        Account acc = new Account(5000, 1234);
        User user = new User("Aiswarya", acc);

        bank.addUser(user);

        try {
            user.login(1234);  
        } catch (UnauthorizedPinException e) {
            System.out.println(e.getMessage());
        }

        acc.deposit(1000);
        acc.withdraw(2000);

        System.out.println("Balance: " + acc.checkBalance());

        Transaction t1 = new Transaction("Deposit", 1000);
        t1.printDetails();

        bank.showUsers();
    }
}