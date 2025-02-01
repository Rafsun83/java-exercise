import java.util.List;

public class Account {
    private int accountNumber;
    private AccountType accountType;
    private double balance;
    private List<Card> card;

    public Account(int accountNumber, AccountType accountType, double balance, List<Card> card) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.card = card;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public AccountType getAccountType() {
        return accountType;
    }
    public double getBalance() {
        return balance;
    }
    public List<Card> getCard() {
        return card;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCard(List<Card> card) {
        this.card =card;
    }
}
