public class Deposit extends Transaction implements Tax {
    public Deposit(double amount) {
        super(amount);
    }

    //Interface Method Implementation here (It's a Interface Implement concept)
    public void calculateTax(){
        if(amount > 100){
            System.out.println("Deposit Tax Allowed: ");
        } else{
            System.out.println("Deposit Tax Not Allowed: ");
        }
    }

    //Abstract method body implementation here (It's a abstract concept)
    public double totalAmount() {
        return (totalAmount + amount);
//        System.out.println("Total amount is " + amount + 20000);
    }

    //Non-abstract method override (It's a polymorphism concept)
    @Override
    public void displayTransactionDetails() {
       System.out.println("Deposit Amount: " + amount);
    }
}
