public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount(String accNumber, Customer owner, double balance, double overdraftLimit) {
        super(accNumber, owner, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        double availableMoney = getBalance() + overdraftLimit;

        if (amount <= availableMoney) {
            super.withdraw(amount);
            if(amount > getBalance()){
                getOwner().getCreditScore().decreaseScore(10);
                System.out.println("Overdraft used. Credit score decreased.");
            }
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}