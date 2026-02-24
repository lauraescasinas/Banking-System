//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble(); sc.nextLine();

        System.out.print("Enter interest interestRate (e.g., 0.05): ");
        double interestRate = sc.nextDouble(); sc.nextLine();

        Account account = new SavingsAccount(accountNumber, balance, interestRate);
        Customer customer = new Customer(customerName, account);

        boolean running = true;
        while (running) {
            System.out.println("\n1.Deposit  2.Withdraw  3.Show Account  4.Calculate Interest  5.Exit");
            System.out.print("Option: ");
            int option = sc.nextInt(); sc.nextLine();

            try {
                switch(option) {
                    case 1:
                        System.out.print("Deposit amount: ");
                        double amount = sc.nextDouble(); sc.nextLine();
                        account.deposit(amount);
                        System.out.println("New balance: " + account.getBalance());
                        break;
                    case 2:
                        System.out.print("Withdraw amount: ");
                        amount = sc.nextDouble(); sc.nextLine();
                        account.withdraw(amount);
                        System.out.println("New balance: " + account.getBalance());
                        break;
                    case 3:
                        System.out.println("Account: " + account.getAccountNumber() + " | Balance: " + account.getBalance());
                        break;
                    case 4:
                        System.out.println("Interest: " + account.calculateInterest());
                        break;
                    case 5:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            } catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Exiting program.");
        sc.close();
    }
}