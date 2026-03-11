//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        bank.bankName = "BEBank";

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

        CheckingAccount checking =
                new CheckingAccount("CHK001", customer, 5000, 1000);

        bank.addAccount(checking);

        SavingsAccount savings =
                new SavingsAccount("SAV001", customer, 8000, 0.03);

        bank.addAccount(savings);


        // loan request
        System.out.print("\nLoan amount: ");
        double loanAmt = sc.nextDouble();

        System.out.print("Loan term (months): ");
        int months = sc.nextInt();

        LoanAccount loan =
                new LoanAccount("LOAN001", customer, loanAmt, 0.05, months);

        bank.addAccount(loan);


        //desposit & withdraw
        Teller teller = new Teller("Anna", bank);

        System.out.println("\n--- Teller Services ---");

        System.out.print("Deposit to account: ");
        double dep = sc.nextDouble();
        teller.deposit("CHK001", dep);

        System.out.print("Withdraw from account: ");
        double wd = sc.nextDouble();
        teller.withdraw("CHK001", wd);

        System.out.println("Checking balance: " + checking.getBalance());


        // interest
        System.out.println("\n--- Applying Interest ---");

        bank.applyInterestToAll();

        System.out.println("Savings after interest: " + savings.getBalance());
        System.out.printf("Loan after interest: %.2f\n", loan.getRemainingLoan());


        //loan payment
        System.out.print("\nEnter loan payment amount: ");
        double payment = sc.nextDouble();
        loan.makePayment(payment);

        System.out.printf("Remaining loan: %.2f\n", loan.getRemainingLoan());


        // credit score
        System.out.println("\n--- Credit Score Check ---");

        Manager manager = new Manager("Michael");

        manager.performDuties();
        customer.getCreditScore().getScore();

        if(manager.approveLoan(customer)){
            System.out.println("Loan Approved!");
        } else {
            System.out.println("Loan Denied.");
        }


        // transaction
        System.out.println("\n--- Checking Transaction History ---");
        checking.printTransactions();

        sc.close();

        System.out.println("\n=== Thank you for using BEBank ===");




    }
}