public class Customer {

    private String id;
    private String name;
    private String address;
    private PIN pin;

    Customer(String id, String name, String address, String pin){
        this.id = id;
        this.name = name;
        this.address = address;
        this.pin = new PIN(pin);
    }

    public boolean login(String enteredPIN) { return pin.authenticate(enteredPIN); }

    public void changePIN(String newPIN) { pin.changePIN(newPIN); }

    public String getName() { return name; }
}
