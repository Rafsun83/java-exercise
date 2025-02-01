public abstract class Transaction {
    protected double amount;
    protected double totalAmount = 10000;

    public Transaction( double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }


    //Use abstract method
    public abstract double totalAmount();

    //Use non-abstract method
    public void displayTransactionDetails() {
        System.out.println("Transaction Amount: " + amount);
    }

}
