
public class Bank {
    private final String name;
    private Customer customer;

    public Bank(String name){ this.name = name; }

    public void setCustomer(Customer customer) { this.customer = customer; }
    public Customer getCustomer() { return customer; }
}
