package algorithmsdecision.bankaccounts;

public class BankAccount {
    private String nameOfOwner;
    private String accountNumber;
    private int balance;

    public BankAccount(String nameOfOwner, String accountNumber, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }
    public void deposit(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return balance;
    }


}
