package BankingSystem;

public class Transaction {

    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public void printDetails() {
        System.out.println("Transaction Type: " + type);
        System.out.println("Amount: " + amount);
    }
}