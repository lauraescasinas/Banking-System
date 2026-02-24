public class PIN {

    private String pin;

    public PIN(String pin) { this.pin = pin; }

    public boolean authenticate(String enteredPIN) { return this.pin.equals(enteredPIN); }

    public void changePIN(String newPin) { this.pin = newPin; }
}
