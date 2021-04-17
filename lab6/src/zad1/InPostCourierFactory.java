package zad1;

public class InPostCourierFactory implements Factory{

    @Override
    public Shipment createShipment() {
        return new InPostCourier();
    }

}