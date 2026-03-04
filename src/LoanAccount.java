public class LoanAccount extends Account implements Interest {

    private double loanAmount;
    private double interestRate;
    private int termMonths;

    private InterestCalculator calculator = new InterestCalculator();

    public LoanAccount(String accNumber, Customer owner,
                       double loanAmount, double rate, int months) {

        super(accNumber, owner, 0);
        this.loanAmount = loanAmount;
        this.interestRate = rate;
        this.termMonths = months;
    }

    @Override
    public double calculateInterest() {
        return calculator.computeCompound(loanAmount, interestRate, termMonths);
    }

    @Override
    public void applyInterest() {
        loanAmount += calculateInterest();
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            loanAmount -= amount;
            getOwner().getCreditScore().increaseScore(15);
            System.out.println("Payment successful. Credit score increased.");
        } else{
            getOwner().getCreditScore().decreaseScore(10);
        }
    }

    public double getRemainingLoan() {
        return loanAmount;
    }

}