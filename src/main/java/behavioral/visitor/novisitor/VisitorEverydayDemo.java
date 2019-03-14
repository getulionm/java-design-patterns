package behavioral.visitor.novisitor;

public class VisitorEverydayDemo {

    // code without a Visitor pattern
    public static void main(String[] args) {

        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());

        double shippingCost = order.calculateShipping();

        System.out.println(shippingCost);

    }

}
