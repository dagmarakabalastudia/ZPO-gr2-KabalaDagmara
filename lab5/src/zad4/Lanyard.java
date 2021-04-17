package zad4;

public class Lanyard extends OrderDecorator {
    public Lanyard(OrderItem newItem) {
        super(newItem);
    }

    public String getDescription(){
        return item.getDescription() + " smycz do pendrive ";
    }

    public double getCost(){
        return item.getCost() + 1.00;
    }

}
