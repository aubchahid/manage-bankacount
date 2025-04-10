
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(
                "254 154 777778484848584 59",
                45000
        );

        SavingAccount savingAccount = new SavingAccount(
                "254 154 777778484848584 59",
                45000,
                true

        );

        Scanner scanner = new Scanner(System.in);
        boolean isExist = false;
        while (!isExist) {

            System.out.println("--------------- Menu ---------------");
            System.out.println("Choose : ");
            System.out.println("1- To enter a new deposit");
            System.out.println("2- To withdraw from your balance");
            System.out.println("3- To display your balance");
            System.out.println("4- To enter a new deposit to saving account");
            System.out.println("5- Display saving account balance");
            System.out.println("6- Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 :
                   System.out.println("Enter the deposit :");
                   double deposit = scanner.nextDouble();
                   bankAccount.deposit(deposit);
                   break;
                case 2 :
                   System.out.println("Enter the amount :");
                   double withdraw = scanner.nextDouble();

                   bankAccount.withdraw(withdraw);
                   break;
                case 3 :
                   bankAccount.getBalance();
                   break;
                case 4 :
                    System.out.println("Enter saving money :");
                    double saving = scanner.nextDouble();
                    savingAccount.deposit(saving);
                    break;
                case 5 :
                   savingAccount.getBalance();
                   break;
                case 6 :
                    isExist = true;
                    break;
                default:
                   System.out.println("Enter a valid menu number.");
            }
        };

        scanner.close();
    }
}