package zad1;

public class PostFactory implements Factory{

    @Override
    public Shipment createShipment() {
        return new Post();
    }

}