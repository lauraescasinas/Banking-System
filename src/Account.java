public abstract class Account implements Transact {
    private String accountNumber;
    private Customer owner;
    private double balance;
    private Transaction[] history = new Transaction[50];
    private int transactionCount = 0;

    public Account(String accountNumber, Customer owner, double balance){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }


    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            addTransaction("Deposit", amount);
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            addTransaction("Withdraw", amount);
        }else{
            System.out.println("Invalid withdrawal amount.");
        }
    }

    private void addTransaction(String type, double amount){
        if(transactionCount < history.length){
            history[transactionCount++] =
                    new Transaction("T" + transactionCount, type, amount,
                            "2026-03-05");
        }
    }

    public void printTransactions(){
        for(int i=0;i<transactionCount;i++){
            System.out.println(history[i].getSummary());
        }
    }

    public String getAccountNumber() { return accountNumber; }

    public Customer getOwner() { return owner; }

    public double getBalance() { return balance; }
}
