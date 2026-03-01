package BankingSystem;

public class Account implements AccountOperations {

    private double balance;
    private int pin;

    public Account(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Invalid or insufficient balance");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }
}