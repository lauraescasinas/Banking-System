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

        ///// CheckingAccount and LoanAccount tester
        System.out.println("\n--- Creating Accounts ---");

        CheckingAccount checking = new CheckingAccount("CHK001", customer, 1000, 500);

        LoanAccount loan = new LoanAccount("LOAN001", customer, 10000, 0.05, 12);

        System.out.println("Checking Account created with balance: "
                + checking.getBalance());

        System.out.println("Loan Account created with loan: "
                + loan.getRemainingLoan());

        ///// Teller tester
        System.out.println("\n--- Teller Transactions ---");

        Teller teller = new Teller("Anna");
        teller.performDuties();

        teller.deposit(checking, 300);
        teller.withdraw(checking, 200);


        ///// Interest / loan tester
        System.out.println("Checking Balance: " + checking.getBalance());

        System.out.println("\n--- Loan Interest + Payment ---");

        loan.applyInterest();
        System.out.println("After interest: " + loan.getRemainingLoan());

        loan.makePayment(2000);
        System.out.println("After payment: " + loan.getRemainingLoan());

        ///// Credit score tester
        System.out.println("\n--- Credit Score Test ---");

        CreditScore score = new CreditScore(650);

        System.out.println("Credit Score: " + score.getScore());
        System.out.println("Loan Eligible? " + score.isEligibleForLoan());

        ///// Transaction tester
        System.out.println("\n--- Transaction Record ---");

        Transaction t =
                new Transaction("T001", "Deposit", 300, "2026-02-28");

        System.out.println(t.getSummary());



    }
}