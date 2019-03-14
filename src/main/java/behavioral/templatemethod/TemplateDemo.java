package behavioral.templatemethod;

public class TemplateDemo {

    public static void main(String[] args) {
        System.out.println("Web Order:");

        OrderTemplate webOrder = new WebOrder(true);
        webOrder.processOrder();

        System.out.println("\nStore Order:");

        OrderTemplate storeOrder = new StoreOrder(false);
        storeOrder.processOrder();

    }
}
