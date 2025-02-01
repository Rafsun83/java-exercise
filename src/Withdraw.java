public class Withdraw extends Transaction implements Tax {

    public Withdraw(double amount) {
        super(amount);
    }

    //Interface Method Implementation here (It's a Interface Implement concept)
    public void calculateTax() {
        if (amount < 1000) {
            System.out.println("Tax is too low");
        } else if (amount < 10000) {
            System.out.println("Tax is too high");
        }
    }

    //Abstract method body implementation here (It's a abstract concept)
    public double totalAmount() {
        return  totalAmount - amount;
//        System.out.println("Total amount is " + amount + 1000);
    }

    //Non-abstract method override (It's a polymorphism concept)
    @Override
    public void displayTransactionDetails() {
//        super.displayTransactionDetails();
        System.out.println("Withdraw Amount: " + amount);
    }
}
