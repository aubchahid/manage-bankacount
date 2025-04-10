public class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    void deposit(double amount) {
        if (amount > 0)  this.balance+= amount;
        else System.out.println("Amount need to be bigger than 0");
    }

    void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("You don't have enough money");
        }
        else if (amount > 0)  {
            this.balance-= amount;
        }
        else {
            System.out.println("Amount need to be bigger than 0");
        }
    }

    void getBalance() {
        System.out.println("the account bank " + this.accountNumber + " with the balance "+ this.balance);
    }

}
