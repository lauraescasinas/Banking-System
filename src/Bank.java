public class Bank {
    String bankName;
    Account[] accounts = new Account[50];
    int customerCount = 0;
    int accountCount = 0;

    void addAccount(Account a) {
        if (accountCount < accounts.length) {
            accounts[accountCount++] = a;
        }
    }

    public void deposit(String accNumber, double amount){
        Account acc = findAccount(accNumber);
        if(acc != null){
            acc.deposit(amount);
        }
    }

    public void withdraw(String accNumber, double amount){
        Account acc = findAccount(accNumber);
        if(acc != null){
            acc.withdraw(amount);
        }
    }

    public void applyInterestToAll(){
        for(int i=0;i<accountCount;i++){
            if(accounts[i] instanceof Interest){
                ((Interest)accounts[i]).applyInterest();
            }
        }
    }


    Account findAccount(String accNumber){
        for (int i = 0; i<accountCount; i++) {
            if(accounts[i].getAccountNumber().equals(accNumber)){
                return accounts[i];
            }
        }
        return null;
    }
}
/*public double calculateInterest(){
    return getBalance() + interestRate;
}*/