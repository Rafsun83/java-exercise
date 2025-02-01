import java.util.List;

public class SavingsAccount extends Account{
    private double withdrawalAmount;
    public SavingsAccount(int accountNumber, AccountType accountType, double balance, List<Card> card, double withdrawalAmount) {
        super(accountNumber, accountType, balance, card);
        this.withdrawalAmount = withdrawalAmount;
    }
    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }
    public void setWithdrawalAmount(double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }
}
