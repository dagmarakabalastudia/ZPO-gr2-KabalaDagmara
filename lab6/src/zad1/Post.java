package zad1;

public class Post implements Shipment{

    @Override
    public void order() {
        System.out.println(" Wybrano wysylkę pocztą polską ");
    }
}