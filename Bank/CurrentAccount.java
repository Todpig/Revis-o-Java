
class CurrentAccount extends Account {

    private double withdrawal_fee = 0.05;
    private Transation transation;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        this.transation = new Transation(balance);
        transation.withdraw(this);
        this.balance -= amount + (amount * withdrawal_fee);
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
