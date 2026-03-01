public class Bank {
    String bankName;
    Account[] accounts = new Account[50];
    Customer[] customers = new Customer[50];
    int customerCount = 0;
    int accountCount = 0;

    void addCustomer(Customer c) {
        if(customerCount < customers.length) {
            customers[customerCount++] = c;
        }
    }
    void addAccount(Account a) {
        if (accountCount < accounts.length) {
            accounts[accountCount++] = a;
        }
    }
    Customer findCustomer(String id){
        for (int i = 0; i< customerCount; i++) {
            if (customers[i].getName().equals(id)){
                return customers[i];
            }
        }
        return null;
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