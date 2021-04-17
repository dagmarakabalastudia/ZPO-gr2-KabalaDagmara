package zad1;

public class CourierFactory implements Factory{

    @Override
    public Shipment createShipment() {
        return new Courier();
    }

}