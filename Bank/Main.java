
class Main {

    public static void main(String[] args) {
        Account account = new CurrentAccount("32343242", "John Doe", 1000);
        Account account2 = new SavingsAccount("32343242", "John Doe", 1000);

        try {
            account.withdraw(100);
            account2.withdraw(920);
            account.deposit(100);
            account2.deposit(100);
            account2.withdraw(100);

            System.err.println("Current Account Balance: " + account.balance);
            System.err.println("Savings Account Balance: " + account2.balance);

            
                
            
        } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
}
