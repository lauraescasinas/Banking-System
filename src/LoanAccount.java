public class LoanAccount extends Account implements Interest {

    private double loanAmount;
    private double interestRate;
    private int termMonths;

    public LoanAccount(String accNumber, Customer owner,
                       double loanAmount, double rate, int months) {

        super(accNumber, owner, 0); // loans start with 0 balance
        this.loanAmount = loanAmount;
        this.interestRate = rate;
        this.termMonths = months;
    }

    @Override
    public double calculateInterest() {
        return loanAmount * interestRate;
    }

    @Override
    public void applyInterest() {
        loanAmount += calculateInterest();
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            loanAmount -= amount;
            System.out.println("Payment successful.");
        }
    }

    public double getRemainingLoan() {
        return loanAmount;
    }

    @Override
    String getAccountType() {
        return "Loan Account";
    }
}