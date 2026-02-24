//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===Welcome to BEBank!===\n");

        System.out.print("Customer ID: ");
        String id = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("Create PIN: ");
        String enteredPIN = sc.nextLine();

        Customer customer = new Customer(id, name, address, enteredPIN);

        System.out.print("\nEnter PIN to login: ");
        String loginPIN = sc.nextLine();

        if(!customer.login(loginPIN)){
            System.out.println("Incorrect PIN. Please try again.");
            return;
        }

        System.out.println("Login successful! Welcome, " + customer.getName() + ".");

        System.out.print("Do you want to change your PIN? (yes/no): ");
        String choice = sc.nextLine();

        if(choice.equalsIgnoreCase("yes")){
            System.out.print("Enter new PIN: ");
            String newPIN = sc.nextLine();
            customer.changePIN(newPIN);
            System.out.println("PIN changed successfully.");
        }


    }
}