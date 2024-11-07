
class Transation {

    double amount;

    public Transation(double amount) {
        this.amount = amount;
    }

    public boolean withdraw(Account account) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        if (account.balance <= 0) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        return true;
    }

    public boolean deposit(Account account) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        return true;
    }
}
