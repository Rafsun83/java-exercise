public class Card {
    private int cardNumber;
    private String cardExpiry;
    private int pin;
    private CardType cardType;
    private Account account;

    public Card(int cardNumber,  String cardExpiry, int pin, CardType cardType, Account account) {
        this.cardNumber = cardNumber;
        this.cardExpiry = cardExpiry;
        this.pin = pin;
        this.cardType = cardType;
        this.account = account;
    }
    public int getCardNumber() {
        return cardNumber;
    }

    public String getCardExpiry() {
        return cardExpiry;
    }
    public int getPin() {
        return pin;
    }
    public CardType getCardType() {
        return cardType;
    }
    public Account getAccount() {
        return account;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardExpiry(String cardExpiry) {
        this.cardExpiry = cardExpiry;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

}
