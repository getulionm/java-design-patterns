package behavioral.templatemethod;

public abstract class OrderTemplate {

    public boolean isGift;

    public OrderTemplate(boolean isGift) {
        this.isGift = isGift;
    }

    //Hooks

    public abstract void doCheckout();

    public abstract void doPayment();

    public abstract void doReceipt();

    public abstract void doDelivery();

    public final void wrapGift() {
        System.out.println("Gift wrapped.");
    }

    // Template Method: final keyword so it won't be @Overridden by subclasses
    public final void processOrder() {
        doCheckout();
        doPayment();
        if (isGift) {
            wrapGift();
        } else {
            doReceipt();
        }
        doDelivery();
    }
}
