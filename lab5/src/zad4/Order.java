package zad4;

public class Order extends OrderDecorator{
    double price;

    public Order(double p) {
        super(null);
        this.price = p;
    }

    @Override
    public String getDescription() {
        return " podstawowe zakupy ";
    }

    @Override
    public double getCost() {
        return this.price;
    }
}
