package zad4;

public class Main {
    public static void main(String[] args) {
        OrderDecorator order = new Order(8);
        OrderDecorator order1 = new Mascot(order);
        OrderDecorator order2 = new Lanyard(order1);
        OrderDecorator order3 = new Discount(order2);
        OrderDecorator order1a = new Order(8);
        OrderDecorator order2a = new Lanyard(order1a);
        OrderDecorator order3a = new Transport(order2a);
        OrderDecorator order4a = new Mascot(order3a);



        System.out.println("Produkty pierwszy rachunek: " + order3.getDescription() + " Kwota: " + order3.getCost());
        System.out.println("Produkty drugi rachunek: " + order4a.getDescription() + " Kwota: " + order4a.getCost());
    }
}
