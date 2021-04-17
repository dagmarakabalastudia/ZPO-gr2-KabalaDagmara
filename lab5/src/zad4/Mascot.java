package zad4;

public class Mascot extends OrderDecorator {
    public Mascot(OrderItem newItem) {
        super(newItem);
    }

    public String getDescription(){
        return item.getDescription() + " maskotka ";
    }

    public double getCost(){
        return item.getCost();
    }

}
