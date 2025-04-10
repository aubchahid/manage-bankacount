
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(
                "254 154 777778484848584 59",
                45000
        );

        Scanner scanner = new Scanner(System.in);
        boolean isExist = false;
        while (!isExist) {

            System.out.println("--------------- Menu ---------------");
            System.out.println("Choose : ");
            System.out.println("1- To enter a new deposit");
            System.out.println("2- To withdraw from your balance");
            System.out.println("3- To display your balance");
            System.out.println("4- Exit");

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
                   isExist = true;
                   break;
                default:
                   System.out.println("Enter a valid menu number.");
            }
        };

        scanner.close();
    }
}