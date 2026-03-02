public class Manager extends Employee{
    public Manager(String name){
        super(name);
    }
    @Override
    public void performDuties(){
        System.out.println(getName() + " approves loan.");
    }
}
