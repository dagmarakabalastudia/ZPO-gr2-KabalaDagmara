package zad2;

public class TruckFactory implements Factory{
    @Override
    public Transport createTransport(){
        return new Truck();
    }
}