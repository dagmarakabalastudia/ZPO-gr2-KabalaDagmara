package zad2;

public class TransportManagement {
    private Transport transport;

    public TransportManagement(Factory factory){
        transport = factory.createTransport();
    }

    public void transport(){
        transport.transport();
    }
}
