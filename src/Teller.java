public class Teller extends Employee {

    private Bank bank;
    public Teller(String name, Bank bank) {
        super(name);
        this.bank = bank;
    }

    @Override
    public void performDuties() {
        System.out.println("Assisting customers with deposits and withdrawals.");
    }

    public void deposit(String accNumber, double amount) {
        bank.deposit(accNumber, amount);
    }

    public void withdraw(String accNumber, double amount) {
        bank.withdraw(accNumber, amount);
    }
}