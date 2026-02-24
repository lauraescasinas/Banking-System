//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank("BEBank");

        System.out.print("Enter customer name: ");
        String customersName = input.nextLine();

        System.out.print("Account type: (savings/checking/fixed): ");
        String accountType = input.nextLine().toLowerCase();

        System.out.print("Account number: ");
        String accountNumber = input.nextLine().toLowerCase();

        System.out.print("Initial balance: ");
        double balance = input.nextDouble();
        input.nextLine();


    }
}