public abstract class Account {
    private String accountNumber;
    private Customer owner;
    private double balance;

    public Account(String accountNumber, Customer owner, double balance){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    abstract String getAccountType();

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public String getAccountNumber() { return accountNumber; }

    public Customer getOwner() { return owner; }

    public double getBalance() { return balance; }
}
