package zad1;

public class Courier implements Shipment{

    @Override
    public void order() {
        System.out.println(" Wybrano wysylkę kurierem ");
    }
}