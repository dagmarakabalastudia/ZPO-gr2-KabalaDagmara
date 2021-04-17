package zad4;


public class Transport extends OrderDecorator {
    public Transport(OrderItem newItem) {
        super(newItem);
    }

    public String getDescription(){
        return item.getDescription() + " z dostawą ";
    }

    public double getCost(){
        return item.getCost() + 13.00;
    }

}
