package zad1;

public class Order {
    private Shipment shipment;

    public Order(Factory factory){
        shipment = factory.createShipment();
    }

    public void order(){
        shipment.order();
    }
}
