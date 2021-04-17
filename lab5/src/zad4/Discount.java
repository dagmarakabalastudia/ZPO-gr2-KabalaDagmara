package zad4;

public class Discount extends OrderDecorator {
    public Discount(OrderItem newItem) {
        super(newItem);
    }

    public String getDescription(){
        return item.getDescription() + " rabacik ";
    }

    public double getCost(){
        if(item.getCost() - 10.00 < 0) {
            return 0;
        }
        else {
            return item.getCost() - 10.00;
        }
    }

}

