public class SavingsAccount extends Account{
    private double interestRate;
    public SavingsAccount(String accountNumber, Customer owner, double balance, double interestRate){
        super(accountNumber, owner, balance);
        this.interestRate = interestRate;
    }
    public double calculateInterest(){
        return getBalance() * interestRate;
    }
    public void applyInterest(){
        double interest = calculateInterest();
        deposit(interest);
    }

    @Override
    String getAccountType(){
        return "Savings Account";
    }
}
