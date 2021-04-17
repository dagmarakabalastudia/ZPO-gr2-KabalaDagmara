package zad1;

public class InPostFactory implements Factory{

    @Override
    public Shipment createShipment() {
        return new InPost();
    }

}