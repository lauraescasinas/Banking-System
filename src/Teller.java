public class Teller extends Employee {

    public Teller(String name) {
        super(name);
    }

    @Override
    public void performDuties() {
        System.out.println("Assisting customers with deposits and withdrawals.");
    }

    public void deposit(Account acc, double amount) {
        acc.deposit(amount);
        System.out.println("Teller deposited " + amount);
    }

    public void withdraw(Account acc, double amount) {
        acc.withdraw(amount);
        System.out.println("Teller processed withdrawal " + amount);
    }
}