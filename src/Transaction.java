public class Transaction {

    private String transactionId;
    private String type;
    private double amount;
    private String date;

    public Transaction(String id, String type, double amount, String date) {
        this.transactionId = id;
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public String getSummary() {
        return transactionId + " | " + type + " | " + amount + " | " + date;
    }
}