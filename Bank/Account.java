
abstract class Account {

    String accountNumber;
    String accountHolderName;
    double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);
}
