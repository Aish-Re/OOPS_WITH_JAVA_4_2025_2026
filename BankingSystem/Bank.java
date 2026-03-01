package BankingSystem;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<User> users;

    public Bank(String bankName) {
        this.bankName = bankName;
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void showUsers() {
        System.out.println("Total Users: " + users.size());
    }
}