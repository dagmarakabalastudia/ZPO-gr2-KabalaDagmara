package zad2;

public class BoatFactory implements Factory{
    @Override
    public Transport createTransport(){
        return new Boat();
    }
}