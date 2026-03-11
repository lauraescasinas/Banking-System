public class SavingsAccount extends Account implements Interest{
    private double interestRate;
    private InterestCalculator calculator = new InterestCalculator();


    public SavingsAccount(String accountNumber, Customer owner, double balance, double interestRate){
        super(accountNumber, owner, balance);
        this.interestRate = interestRate;
    }
    @Override
    public double calculateInterest(){
        return calculator.computeSimple(getBalance(), interestRate);
    }

    @Override
    public void applyInterest(){
        double interest = calculateInterest();
        deposit(interest);
    }

}
