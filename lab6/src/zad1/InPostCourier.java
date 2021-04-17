package zad1;

public class InPostCourier implements Shipment{

    @Override
    public void order() {
        System.out.println(" Wybrano wysylkę kurierem inpostu ");
    }
}