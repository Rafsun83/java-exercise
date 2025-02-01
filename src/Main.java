import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Create a card
        Card card1 = new Card(1211222, "12-12-12", 6666, CardType.DEBIT, null);
        Card card2 = new Card(1211222, "12-12-12", 6666, CardType.CREDIT, null);
        Card card3 = new Card(1211222, "12-12-12", 6666, CardType.CREDIT, null);

        //List of cards
        List<Card> cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        //Create savings account
        SavingsAccount savingsAccount = new SavingsAccount(16242, AccountType.SAVINGS, 262533, cards, 100000);

        //Create an account
        Account account1 = new Account(6245242, AccountType.SAVINGS, 1226262, cards);
        Account account2 = new Account(6245243, AccountType.BLOCK, 1226262, cards);
        card1.setAccount(account1);
        card2.setAccount(account2);
        card3.setAccount(savingsAccount);

        //List of Accounts
        List<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(savingsAccount);


        //Customer create
        Customer customer1 = new Customer("1", "Rafsun Jani", "01834390150", "rafsun@gmail.com", null, null);
        Customer customer2 = new Customer("1", "Faisal Mahmud", "01834390150", "rafsun@gmail.com", null, null);
        Customer customer3 = new Customer("1", "Hasan", "01834390150", "rafsun@gmail.com", null, null);

        //Set accounts and card for customer
        customer1.setAccounts(accounts);
        customer1.setCards(cards);
        customer2.setAccounts(accounts);
        customer2.setCards(cards);
        customer3.setAccounts(accounts);
        customer3.setCards(cards);

        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

//        for( Customer customer : customers ) {
//            System.out.println("Customer: - " + customer.getName() + " Account: " + customer.getAccounts());
//            for( Account account : customer.getAccounts() ) {
//                System.out.println("- " + account.getAccountType() + " balance: " + account.getBalance());
//                for(Card card: customer.getCards()) {
//                    System.out.println("- " + card.getCardType() + " card: " + card.getCardNumber());
//                }
//            }
//        }
        Transaction withdrawTransaction = new Withdraw(5000);
        Transaction depositTransaction = new Deposit(3000);
        Withdraw withdrawTax = new Withdraw(2000);

        System.out.println("Total Amount: " + withdrawTransaction.totalAmount());
        withdrawTransaction.displayTransactionDetails();
        withdrawTax.calculateTax();

        depositTransaction.displayTransactionDetails();
        System.out.println("Total Amount: " + depositTransaction.totalAmount());


    }
}