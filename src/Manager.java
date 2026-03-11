public class Manager extends Employee{
    public Manager(String name){
        super(name);
    }
    @Override
    public void performDuties(){
        System.out.println(getName() + " approves loan.");
    }

    public boolean approveLoan(Customer customer){
        return customer.getCreditScore().isEligibleForLoan();
    }
}
