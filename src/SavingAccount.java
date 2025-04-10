public class SavingAccount extends BankAccount {
    private boolean isOpen;

    SavingAccount(String accountNumber, double balance, boolean isOpen) {
        super(accountNumber, balance);
        this.isOpen = isOpen;
    }


    void deposit(double amount) {
        super.deposit(amount);
        System.out.println("Deposit made to savings account");
    }
}
