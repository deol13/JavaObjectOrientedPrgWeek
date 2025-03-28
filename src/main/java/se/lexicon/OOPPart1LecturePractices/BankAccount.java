package se.lexicon.OOPPart1LecturePractices;

public class BankAccount {
    private static int counter;
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    BankAccount(double balance, String name, String email, String phoneNumber) {
        accountNumber = ++counter;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean deposit(double fund){
       if(fund > 0) {
           balance += fund;
           return true;
       }
       return false;
    }

    public boolean withdraw(double sum) {
        if(sum > 0 && sum <= balance) {
            balance -= sum;
            return true;
        }
        return  false;
    }
}
