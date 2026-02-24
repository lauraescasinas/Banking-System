public abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance){
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public void setBalance(double balance) { this.balance = balance; }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    public void deposit(double amount){
        if(amount < 0){
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount > balance){
            return;
        }
        balance -= amount;
    }

    public abstract double calculateInterest();
}
