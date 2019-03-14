package creational.abstractfactory;

public abstract class CreditCard {
    protected int cardNumberLenght;
    protected int cscNumber;

    public int getCardNumberLenght() {
        return cardNumberLenght;
    }

    public void setCardNumberLenght(int cardNumberLenght) {
        this.cardNumberLenght = cardNumberLenght;
    }

    public int getCscNumber() {
        return cscNumber;
    }

    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }
}
