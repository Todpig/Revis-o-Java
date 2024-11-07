
class SavingsAccount extends Account {

    private double limit_withdraw = 1000;
    private double count_withdraw = 0;
    private Transation transation;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        this.transation = new Transation(balance);
        transation.withdraw(this);
        if (count_withdraw > limit_withdraw) {
            throw new IllegalArgumentException("Withdrawal limit exceeded");
        }
        if (count_withdraw + amount > limit_withdraw) {
            throw new IllegalArgumentException("Withdrawal limit exceeded " + (limit_withdraw - count_withdraw) + " available for withdrawal");
        }
        this.balance -= amount;
        this.count_withdraw += amount;
        System.out.println("Withdrawal fee: " + (amount));
    }

    @Override
    public void deposit(double amount) {
        this.transation = new Transation(balance);
        this.transation.deposit(this);
        this.balance += amount;
        System.out.println("Deposit fee: " + (amount));
    }

}
