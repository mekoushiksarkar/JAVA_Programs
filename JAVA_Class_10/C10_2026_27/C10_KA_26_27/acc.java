// Bank Account class with overloaded constructors and member methods

public class BankAccount {
    // Instance Variables
    private String accountHolder;
    private String accountType;
    private double balance;

    // Constructor 1: To initialise all the instance variables
    public BankAccount(String accountHolder, String accountType, double balance) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Constructor 2: Overloaded constructor to initialise accountHolder and accountType, and set balance to 0.0
    public BankAccount(String accountHolder, String accountType) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    // Constructor 3: Overloaded constructor to initialise accountHolder, accountType, and balance
    // (Reuses Constructor 1 via constructor chaining)
    public BankAccount(double balance, String accountHolder, String accountType) {
        this(accountHolder, accountType, balance);
    }

    // Member Methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String accountInfo() {
        return "Account Holder: " + accountHolder + 
               ", Account Type: " + accountType + 
               ", Balance: $" + balance;
    }
}